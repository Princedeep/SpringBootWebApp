package com.springboot.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.webapp.model.Customers;
import com.springboot.webapp.repository.CustomerRepo;

import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
   private CustomerRepo repo;
	@Override
	public List<Customers> getAllCustomers() {
		
		return repo.findAll();
	}
	@Override
	public void saveCustomer(Customers customer) {
		 repo.save(customer);
		
	}
	@Override
	public Customers getCustomerByID(long cid) {
		Customers cust;
		Optional<Customers> optional=repo.findById(cid);
		if(optional.isPresent()) {
			cust=optional.get();
			
		}else {
		throw new RuntimeException("Customer not found in database with id :"+cid);
	}

	return cust;
	
}
	
	@Override
	public void deleteCustomerByID(long cid) {
		repo.deleteById(cid);
		
	}

	
	
}