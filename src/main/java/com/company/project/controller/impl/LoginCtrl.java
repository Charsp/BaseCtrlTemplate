package com.company.project.controller.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.project.controller.ILoginController;
import com.company.project.model.AdminUser;
import com.company.project.service.IUserLoginService;
import com.company.project.vo.LoginInfo;

@Controller
@RequestMapping("/mgr")
@ResponseBody
public class LoginCtrl implements ILoginController {
	/**
	 * 用户登陆服务
	 */
	private IUserLoginService userLoginService;

	@Autowired
	public void setUserLoginService(IUserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	@Override
	@RequestMapping("/userlogin")
	public Map<String, Object> userLogin(LoginInfo loginInfo) {
		// 将与view通信的VO层的代码转换为内置使用的model
		AdminUser user = new AdminUser();
		user.setPasssword(loginInfo.getPasssword());
		user.setUsername(loginInfo.getUsername()); 
		return userLoginService.userLoginCheck(user);
	}

	@Override
	@RequestMapping("/userlogout")
	public Map<String, Object> userLogout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/register")
	public Map<String, Object> userRegister() {
		// TODO Auto-generated method stub
		return null;
	}

}
