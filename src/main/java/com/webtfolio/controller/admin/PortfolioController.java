package com.webtfolio.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtfolio.service.admin.PortfolioService;

@Controller("adminPortfolioController")
@RequestMapping("/admin/portfolio/")
public class PortfolioController {
	
	@Autowired
	private PortfolioService service;
	
	@GetMapping("reg")
	public String reg() {
		return "admin.portfolio.reg";
	}
	
}
