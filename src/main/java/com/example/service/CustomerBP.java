package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Customer;

@Component
public class CustomerBP {
	public List<Customer>  customerList = new ArrayList();
	
	public List<Customer> getCustomers(){
		Customer customer = new Customer(100,"Arularasan",30,true);
		customerList.add(customer);
		customer = new Customer(101,"Ranjith",30,true);
		customerList.add(customer);
		customer = new Customer(102,"Rammari",30,true);
		customerList.add(customer);
		customer = new Customer(103,"Parta",30,true);
		customerList.add(customer);
		customer = new Customer(104,"Kaushuik",30,true);
		customerList.add(customer);
		customer = new Customer(105,"Selva",30,true);
		customerList.add(customer);
		return customerList; 
	}
	
	public Customer addCustomer(Customer customer){
		customer.setActive(true);
		customer.setId(customerList.get(customerList.size()-1).getId()+1);
		customerList.add(customer);
		return customer;
	}

}
