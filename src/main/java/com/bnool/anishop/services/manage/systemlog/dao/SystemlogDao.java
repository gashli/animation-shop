package com.bnool.anishop.services.manage.systemlog.dao;import com.bnool.anishop.core.DaoManager;import com.bnool.anishop.services.manage.systemlog.bean.Systemlog;public interface SystemlogDao extends DaoManager<Systemlog> {	Systemlog selectFirstOne(String account);}