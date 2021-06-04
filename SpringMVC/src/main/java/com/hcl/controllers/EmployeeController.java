package com.hcl.controllers;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Employee;
import com.hcl.model.EmployeeBean;
import com.hcl.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value ="/" ,method=RequestMethod.GET)
	public String homePage(){
		return "employeesList";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addLogin(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		
		try {
			employeeService.addEmployee(employee);
			mv.addObject("success", "uploding successful...");
			mv.setViewName("addEmployee");
		}catch(Exception e) {
			mv.addObject(employee);
			mv.addObject("errmsg", "ID alredy exist");
			mv.setViewName("addEmployee");
		}
		
		return mv;
	}
	@RequestMapping(value = "/vi", method = RequestMethod.GET)
	public ModelAndView addview(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		
		try {
			employeeService.getList();
			mv.addObject("success", employee);
			mv.setViewName("employeesList");
		}catch(Exception e) {
		
		}
		
		return mv;
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String getList(Map<String, Object> map) {
		try {
			map.put("document", new Employee());
			map.put("documentList", employeeService.getList());
		}catch(Exception e) {
			e.printStackTrace();
		}

		return "employeesList";
	}
	
}
