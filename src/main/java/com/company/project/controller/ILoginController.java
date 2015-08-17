package com.company.project.controller;

import java.util.Map;

import com.company.project.vo.LoginInfo;

/**
 * 登陆模块所有子控制代码
 * 
 * @author CharsBoll {@value /mgr}
 */
public interface ILoginController {
	/**
	 * 用户注销页面 {@value /register}
	 */
	public Map<String, Object> userRegister();

	/**
	 * 用户登陆页面 {@value /userlogin}
	 */
	public Map<String, Object> userLogin(LoginInfo loginInfo);

	/**
	 * 用户注销页面 {@value /userlogout}
	 */
	public Map<String, Object> userLogout();
}
