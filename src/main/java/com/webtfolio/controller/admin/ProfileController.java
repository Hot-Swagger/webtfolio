package com.webtfolio.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminProfileController")
@RequestMapping("/admin/profile/")
public class ProfileController {
	
	@GetMapping("reg")
	public String reg() {
		return "admin.profile.reg";
	}
	
}
