package com.company.project.service;

import java.util.Map;

import com.company.project.model.AdminUser;

public interface IUserLoginService {
	/**
	 * 用户登陆检查
	 * 
	 * @return
	 */
	public Map<String, Object> userLoginCheck(AdminUser adminUser);
}
