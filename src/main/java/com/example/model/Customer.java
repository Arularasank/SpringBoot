package com.example.model;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private long id;
	private String name;
	private int age;
	private boolean active;
	
	public Customer(){
		
	}
	
	public Customer(long id, String name, int age, boolean active){
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString(){
		return "Customer [id="+id+", name= "+name+", age= "+age+", active= " +active+"]";
		
	}
}
