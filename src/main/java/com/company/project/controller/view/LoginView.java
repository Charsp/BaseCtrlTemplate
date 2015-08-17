package com.company.project.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.project.controller.ILoginViewController;

@Controller
@RequestMapping("/mgr")
public class LoginView implements ILoginViewController {

	@Override
	@RequestMapping("/login")
	public ModelAndView getLogin() {
		return new ModelAndView();
	}

	@Override
	@RequestMapping("/logout")
	public ModelAndView getLogout() {
		return new ModelAndView();
	}
}
