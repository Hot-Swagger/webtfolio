package com.webtfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtfolio.service.ExperienceService;

@Controller
@RequestMapping("/experience/")
public class ExperienceController {
	
	@Autowired
	private ExperienceService service;
	
	@GetMapping("detail")
	public String detail() {
		
		return "experience.detail";
	}
}
