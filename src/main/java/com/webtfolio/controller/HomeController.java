package com.webtfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webtfolio.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@GetMapping("index")
	public String index(Model model) {
		
		service.getPortfolioList("dskim", 1, model);
		return "home.index";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "home.login";
	}
	
}
