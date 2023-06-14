package com.bway.springpdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springpdemo.model.User;
import com.bway.springpdemo.repository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
		
     User usr = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		if(usr != null) {
			
		   model.addAttribute("uname", user.getUsername());
			
			return "Home";
		}
		
		model.addAttribute("message","user not found!!");
		return "LoginForm";
	}

}
