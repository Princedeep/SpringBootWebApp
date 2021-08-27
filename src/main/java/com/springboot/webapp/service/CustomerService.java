package com.springboot.webapp.service;

import java.util.List;

import com.springboot.webapp.model.Customers;

public interface CustomerService {
	
	
	List<Customers> getAllCustomers();
	
	void saveCustomer(Customers customer);
	
	Customers getCustomerByID(long ID);
	
	void deleteCustomerByID(long cid);
}
