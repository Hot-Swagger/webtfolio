package com.webtfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("index")
	public String index() {
		
		return "home.index";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "home.login";
	}
}
