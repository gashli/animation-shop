package com.bnool.anishop.services.manage.email.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.manage.email.EmailService;import com.bnool.anishop.services.manage.email.bean.Email;import com.bnool.anishop.services.manage.email.dao.EmailDao;public class EmailServiceImpl extends ServersManager<Email> implements		EmailService {	private EmailDao emailDao;	public void setEmailDao(EmailDao emailDao) {		this.emailDao = emailDao;	}}