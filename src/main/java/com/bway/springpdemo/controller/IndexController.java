package com.bway.springpdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // controller use for request processing.
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}

}
