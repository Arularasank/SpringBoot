package com.example.demo;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.WelcomeBP;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeBP welcomeBP;
	//${spring.data.rest.base-path}
	@RequestMapping("/customers")
	public List welcome(){
		List<String> l = welcomeBP.getWelcome();
		System.out.println("Before Sorting:");
		for(String s : l){
			System.out.println(s);
		}
		System.out.println("After Sorting:");
		Collections.sort(l);
		for(String s : l){
			System.out.println(s);
		}
		return l;
	}
	
	@GetMapping("/welcomeTest")
	public String welcomeTest(){
		return "Welcome Test";
	}

}
