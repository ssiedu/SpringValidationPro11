package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.ProviderDAO;
import com.ssi.entities.Provider;

@Controller
public class ProviderController {
	@Autowired
	ProviderDAO providerDAO;
	
	@RequestMapping("newprovider")
	public String showProviderRegistrationForm(){
		return "providerregistration";
	}
	
	@RequestMapping("saveprovider")
	public ModelAndView saveProviderData(@ModelAttribute("provider") Provider provider){
		System.out.println(provider);
		providerDAO.saveProvider(provider);
		ModelAndView mv=new ModelAndView("providersuccess");
		return mv;
	}
}
