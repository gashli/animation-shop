package com.bnool.anishop.services.manage.keyvalue.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.manage.keyvalue.KeyvalueService;import com.bnool.anishop.services.manage.keyvalue.bean.Keyvalue;import com.bnool.anishop.services.manage.keyvalue.dao.KeyvalueDao;public class KeyvalueServiceImpl extends ServersManager<Keyvalue> implements		KeyvalueService {	private KeyvalueDao keyvalueDao;	public void setKeyvalueDao(KeyvalueDao keyvalueDao) {		this.keyvalueDao = keyvalueDao;	}}