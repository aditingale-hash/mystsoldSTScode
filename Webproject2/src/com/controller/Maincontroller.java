package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.bean.Employee;

@Controller
public class Maincontroller {
	@Autowired
	private Employee employee;
	@RequestMapping("/")
	public ModelAndView showHome(Model model, HttpServletRequest request) {
		
		
		//type one 
		// using model interface
		model.addAttribute("msg_model", "Hello users");
		model.addAttribute("employee", employee);
		//type two
		//HttpServletRequest class
		request.setAttribute("msg_request", "Hello Request");
		
		
		//type three
		//modelAndView class
		ModelAndView mav= new ModelAndView();
	mav.addObject("msg_mav","Hello ModelAndView");
	mav.setViewName("home");
	return mav;
	
	}
	@RequestMapping("/products")
	public String showProducts(Model model,HttpServletRequest request) {
		String cname=request.getParameter("name");
		model.addAttribute("cname", cname);
		return "product";
	}
		}
