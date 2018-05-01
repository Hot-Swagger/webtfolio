package com.webtfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtfolio.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@GetMapping("index")
	public String index() {
		
		return "home.index";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "home.login";
	}
	
}
