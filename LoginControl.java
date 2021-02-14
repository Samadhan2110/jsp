package com.samlab.practiceapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginControl {
	
@RequestMapping("/loginform")
public String login() {
	return "LoginPage";
}
@RequestMapping("/userData")   //which is in loginform action
public ModelAndView loginInfo(UserREgistation reg) {
	
	ModelMap m=new ModelMap();
	m.addAttribute("name",reg.getUName());//aceess user name
	m.addAttribute("id",reg.AutoId());//aceess user name
	m.addAttribute("date",reg.CurrentDate());//aceess user name
	
	ModelAndView mv=new ModelAndView("UserDetail");//which html or jsp page is display
	mv.addObject("regObj",m);//send data to jsp page
	
	return mv;
}
}
