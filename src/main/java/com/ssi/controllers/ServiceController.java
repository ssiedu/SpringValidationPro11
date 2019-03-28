package com.ssi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.ServiceDAO;
import com.ssi.entities.Service;

@Controller
public class ServiceController {

	@Autowired
	ServiceDAO serviceDAO;
	
	@RequestMapping("viewallservices")
	public ModelAndView showServiceList(){
		List<Service> list=serviceDAO.getAllServices();
		ModelAndView mv=new ModelAndView("servicelist.jsp");
		mv.addObject("services", list);
		return mv;
	}
	@RequestMapping("saveservice")
	public ModelAndView saveServiceData(@ModelAttribute("service") Service service){
		serviceDAO.addSerive(service);
		ModelAndView mv=new ModelAndView("serviceentrysuccess.jsp");
		return mv;
	}
	@RequestMapping("newservice")
	public String showServiceEntryForm(){
		return "serviceentry.jsp";
	}
	@RequestMapping("adminhome")
	public String showAdminHome(){
		return "adminhome.jsp";
	}
}
