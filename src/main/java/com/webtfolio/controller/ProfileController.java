package com.webtfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtfolio.service.ProfileService;

@Controller
@RequestMapping("/profile/")
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	
	@GetMapping("detail")
	public String detail(Model model) {
		
		service.getProfile("dskim", model);
		
		return "profile.detail";
	}
}
