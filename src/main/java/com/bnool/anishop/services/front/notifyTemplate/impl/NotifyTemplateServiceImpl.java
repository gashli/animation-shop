package com.bnool.anishop.services.front.notifyTemplate.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.front.notifyTemplate.NotifyTemplateService;import com.bnool.anishop.services.front.notifyTemplate.bean.NotifyTemplate;import com.bnool.anishop.services.front.notifyTemplate.dao.NotifyTemplateDao;public class NotifyTemplateServiceImpl extends ServersManager<NotifyTemplate>		implements NotifyTemplateService {	private NotifyTemplateDao notifyTemplateDao;	public void setNotifyTemplateDao(NotifyTemplateDao notifyTemplateDao) {		this.notifyTemplateDao = notifyTemplateDao;	}}