package com.bnool.anishop.services.front.attribute.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.front.attribute.AttributeService;import com.bnool.anishop.services.front.attribute.bean.Attribute;import com.bnool.anishop.services.front.attribute.dao.AttributeDao;public class AttributeServiceImpl extends ServersManager<Attribute> implements		AttributeService {	private AttributeDao attributeDao;	public void setAttributeDao(AttributeDao attributeDao) {		this.attributeDao = attributeDao;	}	//	/**//	 * 插入父属性和批量的子属性集合//	 *///	public int insert(Attribute e) {//		if(e.getAttrNames()==null || e.getAttrNames().length==0){//			throw new NullPointerException("attrNames is null");//		}//		int id = 0;//		if(StringUtils.isNotBlank(e.getId())){//			id = Integer.valueOf(e.getId());//			//更新主属性//			attributeDao.update(e);//			//删除已经插入的子属性的数据//			attributeDao.deleteByPid(e);//		}else{//			//插入父属性//			id = attributeDao.insert(e);//		}//		//		if(id==0){//			throw new RuntimeException("id is error:"+id);//		}//		//组装子属性对象集合并插入//		for(int i=0;i<e.getAttrNames().length;i++){//			Attribute attr = new Attribute();//			attr.setName(e.getAttrNames()[i]);//			attr.setPid(id);//			attributeDao.insert(attr);//		}//		return 0;//	}//	//	/**//	 * 删除属性，需要删除当前选择的属性和该属性下面的所有子属性集合//	 *///	public int delete(Attribute e) {//		super.delete(e);//		attributeDao.deleteByPid(e);//		return 1;//	}}