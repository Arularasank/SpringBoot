package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerBP;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerBP customerBP;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		customerBP.customerList = new ArrayList();
		List<Customer> customers = new ArrayList<>();
		customers = customerBP.getCustomers();
		return customers;
	}
	
	@PostMapping("/customers/create")
	public Customer saveCustomer(@RequestBody Customer customer){
		return customerBP.addCustomer(customer);
		
	}
}
