package com.ssi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.EmpDAO;
import com.ssi.entities.Emp;

@Controller
public class EmpController {

	@Autowired
	private EmpDAO dao;
	
	@RequestMapping("newemp")
	public ModelAndView showEmpEntryForm(){
		ModelAndView mv=new ModelAndView("empentry");
		mv.addObject("emp", new Emp());
		return mv;
	}
	@RequestMapping("saveemp")
	public ModelAndView saveEmpData(@Valid @ModelAttribute("emp") Emp emp, BindingResult result){
		
		if(result.hasErrors()){
			//ModelAndView mv=new ModelAndView("errorpage");
			ModelAndView mv=new ModelAndView("empentry");
			return mv;
		}
		
		//dao.saveEmp(emp);
		ModelAndView mv=new ModelAndView("success");
		return mv;
	}
}
