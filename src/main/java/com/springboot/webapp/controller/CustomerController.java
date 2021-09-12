package com.springboot.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.webapp.model.Customers;
import com.springboot.webapp.service.CustomerService;

@Controller
public class CustomerController {

	
//display list of customers	
//To supply the list of employees to view layer , we passed model object
	
	@Autowired
	CustomerService service;
	
	@RequestMapping("/")
	public String getCustomers(Model model) {
		model.addAttribute("listCustomers",  service.getAllCustomers());
		
		return "home";
		
	}
	
	@RequestMapping("/newCustomerForm")
	public String showform(Model model){
	//create a model object to bind with data
	Customers customers=new Customers();
	model.addAttribute("customer" ,customers);
		
		return "newCustomer" ;
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customers")Customers customers) //@Model attrribute:to bind all form data with customers object
	{
		//save customer to database
		service.saveCustomer(customers);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/updateCustomerForm/{cid}")
	public String updateForm(@PathVariable (value="cid") long cid, Model model) {
		
		//get customer from service
		Customers customer=service.getCustomerByID(cid);
		service.deleteCustomerByID(cid);
		model.addAttribute("customers", customer);
		
		
		return "updatedCustomer";
		
	}
	@GetMapping("/deleteCustomer/{cid}")
	public String deleteEmployee(@PathVariable (value = "cid") long cid) {
		
		// call delete customer method 
		service.deleteCustomerByID(cid);
		return "redirect:/";
	}
	
	
}
