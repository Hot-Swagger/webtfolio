package com.webtfolio.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminPortfolioController")
@RequestMapping("/admin/portfolio/")
public class PortfolioController {
	
	@GetMapping("reg")
	public String reg() {
		return "admin.portfolio.reg";
	}
	
}
