package com.bnool.anishop.services.front.email.dao;import com.bnool.anishop.core.DaoManager;import com.bnool.anishop.services.front.email.bean.Email;public interface EmailDao extends DaoManager<Email> {	void updateEmailInvalidWhenReg(Email email);}