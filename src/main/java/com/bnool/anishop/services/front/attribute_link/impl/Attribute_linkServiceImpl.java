package com.bnool.anishop.services.front.attribute_link.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.front.attribute_link.Attribute_linkService;import com.bnool.anishop.services.front.attribute_link.bean.Attribute_link;import com.bnool.anishop.services.front.attribute_link.dao.Attribute_linkDao;public class Attribute_linkServiceImpl extends ServersManager<Attribute_link>		implements Attribute_linkService {	private Attribute_linkDao attribute_linkDao;	public void setAttribute_linkDao(Attribute_linkDao attribute_linkDao) {		this.attribute_linkDao = attribute_linkDao;	}	@Override	public int deleteByCondition(Attribute_link e) {		return attribute_linkDao.deleteByCondition(e);	}}