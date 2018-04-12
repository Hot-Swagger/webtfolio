package com.webtfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/experience/")
public class ExperienceController {
	
	@GetMapping("detail")
	public String detail() {
		
		return "experience.detail";
	}
}
