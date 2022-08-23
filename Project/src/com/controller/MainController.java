package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	

	@RequestMapping("/")
	public String showHome(Model model) {
		
		//type one 
				// using model interface
				model.addAttribute("msg_model", "Hello users");
				
				//type two
				//HttpServletRequest class
				//request.setAttribute("msg_request", "Hello Request");
				
				
				//type three
				//modelAndView class
				//ModelAndView mav= new ModelAndView();
		//	mav.addObject("mas_mav","Hello ModelAndView");
			//mav.setViewName("home");
			return "home";
		
		
		
	}
	
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
 }
	
		@RequestMapping("/products")
		public String showProducts() {
			return "product";
               }
		
		
}
