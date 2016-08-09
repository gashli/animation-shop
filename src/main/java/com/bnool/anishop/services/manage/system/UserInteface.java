package com.bnool.anishop.services.manage.system;

import com.bnool.anishop.core.Services;
import com.bnool.anishop.core.system.bean.User;

public interface UserInteface extends Services<User> {
	/**
	 * @param e
	 * @return
	 */
	public User login(User e);
}
