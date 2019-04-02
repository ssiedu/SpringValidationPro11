package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.UserDAO;
import com.ssi.entities.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("verifyuser")
	public ModelAndView verifyUserData(@ModelAttribute("user") User user){
		boolean success=userDAO.verifyUser(user);
		if(success){
		ModelAndView mv=new ModelAndView("userdashboard");
		return mv;
		}else{
			ModelAndView mv=new ModelAndView("userlogin");
			return mv;
		}
	}
	@RequestMapping("userlogin")
	public String showUserLoginForm(){
		return "userlogin";
	}
	@RequestMapping("newuser")
	public String showUserRegistrationForm(){
		return "userregistration";
	}
	
	@RequestMapping("saveuser")
	public ModelAndView saveUserData(@ModelAttribute("user") User user){
		userDAO.saveOrUpdateUser(user);
		ModelAndView mv=new ModelAndView("usersuccess");
		return mv;
	}
}
