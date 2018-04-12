package com.webtfolio.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminHomeController")
@RequestMapping("/admin/home/")
public class HomeController {
	
	@GetMapping("login")
	public String login() {
		
		return "admin.home.login";
	}
}
