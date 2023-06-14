package com.bway.springpdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springpdemo.model.User;
import com.bway.springpdemo.repository.UserRepository;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepository  userRepo;
	
	@GetMapping("/signup")
	public String getSignupForm() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {
		
		//send user data in db
		userRepo.save(user);
		
		return "LoginForm";
	}

	
	  /*
	   *  ===== To connect data base in spring boot project ==
	   *    a> put "Spring Data JPA" dependency
	   *    b> put "MySql Driver"  dependency
	   */
}
