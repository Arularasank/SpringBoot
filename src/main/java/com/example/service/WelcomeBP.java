package com.example.service;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBP {
	
	public List getWelcome(){
		ArrayList al = new ArrayList();
		al.add("Arul");
		al.add("Rammari");
		al.add("Ranjith");
		al.add("Partha");
		al.add("Kaushik");
		al.add("Selva");
		al.add("Shanmugam");
		return al;
	}

}
