package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.bean.Customer;
import com.main.bean.Employee;
import com.main.service.CustomerService;


@Controller
public class CustomerController {
	
@Autowired
private CustomerService customerService;

@Autowired
private Employee employee;

	@RequestMapping("/customer")
	public String showCustomer(Model model) {
		Customer customer = customerService.fetchCustomer(3);
		model.addAttribute("customer", customer);
		return "customer";
	}
	@RequestMapping("/add-customer")
	public String addCustomer(@Valid Employee employee,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("Employee",employee);
			return "home";	
		}
		model.addAttribute("employee", employee);
		return "employee";
	}
	
}
