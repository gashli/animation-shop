package com.bnool.anishop.services.manage.order.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.manage.order.OrderService;import com.bnool.anishop.services.manage.order.bean.Order;import com.bnool.anishop.services.manage.order.bean.OrdersReport;import com.bnool.anishop.services.manage.order.dao.OrderDao;import com.bnool.anishop.services.manage.orderlog.bean.Orderlog;import com.bnool.anishop.services.manage.orderlog.dao.OrderlogDao;import com.bnool.anishop.web.action.manage.report.ReportInfo;import org.apache.commons.lang.StringUtils;import java.util.List;public class OrderServiceImpl extends ServersManager<Order> implements		OrderService {	private OrderDao orderDao;	private OrderlogDao orderlogDao;	public void setOrderlogDao(OrderlogDao orderlogDao) {		this.orderlogDao = orderlogDao;	}	public void setOrderDao(OrderDao orderDao) {		this.orderDao = orderDao;	}	@Override	public void updatePayMonery(Order e,String account) {				if(StringUtils.isBlank(e.getId()) || StringUtils.isBlank(account)){			throw new NullPointerException("修改失败，参数不能为空！");		}		if(Double.valueOf(e.getAmount()) < 0){			throw new NullPointerException("修改失败，订单总金额不能小于0!");		}				if(StringUtils.isBlank(e.getUpdatePayMoneryRemark())){			insertOrderlog(e.getId(),"【修改订单总金额】总金额修改为："+e.getAmount(),account);		}else{			insertOrderlog(e.getId(),"【修改订单总金额】总金额修改为："+e.getAmount()+"，修改人输入备注："+e.getUpdatePayMoneryRemark(),account);		}				e.setUpdateAmount("y");//标记订单总金额被后台管理员修改过		e.setPtotal(e.getAmount());//商品总金额设置为订单总支付金额		e.setFee("0");//配送费设置为0		orderDao.updatePayMonery(e);	}		/**	 * 插入订单操作日志	 * @param orderid	订单ID	 * @param content	日志内容	 */	private void insertOrderlog(String orderid,String content,String account) {		Orderlog orderlog = new Orderlog();		orderlog.setOrderid(orderid);//订单ID		orderlog.setAccount(account);//操作人账号		orderlog.setContent(content);//日志内容		orderlog.setAccountType(Orderlog.orderlog_accountType_m);		orderlogDao.insert(orderlog);	}	@Override	public List<Order> selectCancelList(Order order) {		return orderDao.selectCancelList(order);	}	@Override	public void cancelOrderByID(String id) {		if(StringUtils.isBlank(id)){			return;//			throw new NullPointerException("订单ID不能为空！");		}		Order order = new Order();		order.setId(id);		order.setStatus(Order.order_status_cancel);		orderDao.update(order);				insertOrderlog(id,"【系统取消】一周内未完全支付并且未审核的订单，系统自动将其取消。", "system");	}	@Override	public List<ReportInfo> selectOrderSales(Order order) {		return orderDao.selectOrderSales(order);	}		@Override	public List<ReportInfo> selectProductSales(Order order) {		return orderDao.selectProductSales(order);	}	@Override	public OrdersReport loadOrdersReport() {		return orderDao.loadOrdersReport();	}}