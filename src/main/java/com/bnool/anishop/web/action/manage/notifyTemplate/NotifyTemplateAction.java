package com.bnool.anishop.web.action.manage.notifyTemplate;import com.alibaba.fastjson.JSON;import com.bnool.anishop.core.BaseAction;import com.bnool.anishop.core.util.FreemarkerTemplateUtil;import com.bnool.anishop.services.manage.notifyTemplate.NotifyTemplateService;import com.bnool.anishop.services.manage.notifyTemplate.bean.NotifyTemplate;import org.apache.commons.lang.StringUtils;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import java.io.IOException;import java.util.HashMap;import java.util.List;import java.util.Map;/** * 通知模板 * @author jqsl2012@163.com * */public class NotifyTemplateAction extends BaseAction<NotifyTemplate> {	private static final Logger logger = LoggerFactory.getLogger(NotifyTemplateAction.class);	private static final long serialVersionUID = 1L;	private NotifyTemplateService notifyTemplateService;	private List<NotifyTemplate> notifyTemplateList;		public List<NotifyTemplate> getNotifyTemplateList() {		return notifyTemplateList;	}	public void setNotifyTemplateList(List<NotifyTemplate> notifyTemplateList) {		this.notifyTemplateList = notifyTemplateList;	}	public NotifyTemplateService getNotifyTemplateService() {		return notifyTemplateService;	}	protected void selectListAfter() {		pager.setPagerUrl("notifyTemplate!selectList.action");	}	public void setNotifyTemplateService(			NotifyTemplateService notifyTemplateService) {		this.notifyTemplateService = notifyTemplateService;	}	public NotifyTemplate getE() {		return this.e;	}	public void prepare() throws Exception {		if (this.e == null) {			this.e = new NotifyTemplate();		}	}	public void insertAfter(NotifyTemplate e) {		e.clear();	}		@Override	public String selectList() throws Exception {		super.initPageSelect();		notifyTemplateList = notifyTemplateService.selectList(new NotifyTemplate());//		if(notifyTemplateList!=null && notifyTemplateList.size()>0){//			for(int i=0;i<){//				//			}//		}		return toList;	}		/**	 * 修改模板	 * @throws IOException 	 *///	public String updateTemplate() throws IOException{//		logger.error("updateTemplate...");//		logger.error("updateTemplate...e="+e.toString());//		if(StringUtils.isBlank(e.getCode()) || StringUtils.isBlank(e.getTemplate())){//			getResponse().getWriter().write("-1");//保存失败，参数不能为空！//		}else{//			getServer().update(getE());//			getResponse().getWriter().write("0");//保存成功//		}//		return null;//	}		@Override	public String update() throws Exception {		logger.error("update...");		logger.error("update...e="+e.toString());		e.setTemplateCheckError(null);		if(StringUtils.isBlank(e.getCode()) || StringUtils.isBlank(e.getTemplate())){			throw new NullPointerException();		}		getServer().update(e);				//验证模板是否可用		if(NotifyTemplate.email_reg.equals(e.getCode())){			Map data = new HashMap();  			data.put("nickname", "测试");			data.put("system", "jeeshop");			data.put("url", "http://www.baidu.com");			data.put("servicesPhone", "400-666-8888");			data.put("systemEmail", "jeeshop@jeeshop.net");			data.put("helpUrl", "http://www.baidu.com");			try {				FreemarkerTemplateUtil.freemarkerProcess(data,e.getTemplate());			} catch (Exception e1) {				e1.printStackTrace();				e.setTemplateCheckError("模板验证未通过！请检查！");			}		}		return selectList();	}		/**	 * 根据code查询指定的模板内容-ajax	 * @return	 * @throws IOException	 */	public String selectTemplateByCode() throws IOException{		if(StringUtils.isBlank(e.getCode())){			throw new NullPointerException("code不能为空！");		}				NotifyTemplate ee = new NotifyTemplate();		ee.setCode(e.getCode());		ee = notifyTemplateService.selectOne(ee);		super.utf8JSON();				String json = JSON.toJSONString(ee);		logger.error("selectTemplateByCode.jspn = "+json);		getResponse().getWriter().write(json);		return null;	}}