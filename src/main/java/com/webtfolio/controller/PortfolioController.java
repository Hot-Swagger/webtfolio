package com.webtfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webtfolio.entity.Portfolio;
import com.webtfolio.service.PortfolioService;

@Controller("portfolio")
@RequestMapping("/portfolio/")
public class PortfolioController {

	@Autowired
	private PortfolioService service;	//	= new NoteService();
	
	@GetMapping("list")
	public String list(@RequestParam(value="p",defaultValue="1")Integer page, Model model) {
		
		List<Portfolio> portfolios = service.getPortfolioList("dskim", page);
		model.addAttribute("portfolios", portfolios);
		return "portfolio.list";
	}
	
	@GetMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
	
		/*Note note = service.getPortfolio(id);
		model.addAttribute("portfolio", portfolio);*/
		return "portfolio.detail";
	}
	
}
