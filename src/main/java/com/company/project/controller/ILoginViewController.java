package com.company.project.controller;

import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆模块所有子页面
 * 
 * @author CharsBoll {@value /mgr}
 */
public interface ILoginViewController {
	/**
	 * 用户登陆页面 {@value /login}
	 */
	public ModelAndView getLogin();

	/**
	 * 用户注销页面 {@value /logout}
	 */
	public ModelAndView getLogout();
}
