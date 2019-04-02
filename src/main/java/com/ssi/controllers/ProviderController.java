package com.ssi.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.ProviderDAO;
import com.ssi.dao.ServiceDAO;
import com.ssi.entities.Provider;

@Controller
public class ProviderController {
	@Autowired
	ProviderDAO providerDAO;
	@Autowired
	ServiceDAO serviceDAO;
	
	@RequestMapping("newprovider")
	public ModelAndView showProviderRegistrationForm(){
		ModelAndView mv=new ModelAndView("providerregistration");
		Provider provider=new Provider();
		mv.addObject("provider", provider);
		Map<String,String> serviceMap=serviceDAO.getAllServiceCodeAndNameMap();
		mv.addObject("scodes",serviceMap);
		return mv;
	}
	
	/*@RequestMapping("newprovider")
	public String showProviderRegistrationForm(){
		return "providerregistration";
	}
	*/
	@RequestMapping("saveprovider")
	public ModelAndView saveProviderData(@ModelAttribute("provider") Provider provider){
		System.out.println(provider);
		providerDAO.saveProvider(provider);
		ModelAndView mv=new ModelAndView("providersuccess");
		return mv;
	}
}
