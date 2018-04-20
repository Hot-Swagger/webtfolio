package com.webtfolio.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtfolio.service.admin.ProfileService;

@Controller("adminProfileController")
@RequestMapping("/admin/profile/")
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	
	@GetMapping("reg")
	public String reg() {
		return "admin.profile.reg";
	}
	
}
