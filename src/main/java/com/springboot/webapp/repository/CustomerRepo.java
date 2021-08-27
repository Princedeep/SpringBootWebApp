package com.springboot.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.webapp.model.Customers;

/* with JSP*/
//public interface CustomersRepo extends CrudRepository<Customers,Integer>{
//	
//
//}

/* For REST API*/
@Repository
public interface CustomerRepo extends JpaRepository<Customers,Long>{
	

}