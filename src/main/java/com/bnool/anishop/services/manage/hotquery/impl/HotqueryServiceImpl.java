package com.bnool.anishop.services.manage.hotquery.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.manage.hotquery.HotqueryService;import com.bnool.anishop.services.manage.hotquery.bean.Hotquery;import com.bnool.anishop.services.manage.hotquery.dao.HotqueryDao;public class HotqueryServiceImpl extends ServersManager<Hotquery> implements		HotqueryService {	private HotqueryDao hotqueryDao;	public void setHotqueryDao(HotqueryDao hotqueryDao) {		this.hotqueryDao = hotqueryDao;	}}