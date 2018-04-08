package com.webtfolio.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webtfolio.entity.Portfolio;
import com.webtfolio.service.admin.PortfolioService;

@Controller("adminPortfolio")
@RequestMapping("/admin/portfolio/")
public class PortfolioController {
	
	@Autowired
	@Qualifier("adminPortfolioService")
	private PortfolioService service;	//	= new NoteService();
	
	@RequestMapping("list")
	public String list(@RequestParam(value="p",defaultValue="1")Integer page, Model model) {
		
		List<Portfolio> portfolios = service.getPortfolioList(page);
		model.addAttribute("portfolios", portfolios);
		return "admin.portfolio.list";
	}
	
	@RequestMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
	
		/*Note note = service.getPortfolio(id);
		model.addAttribute("portfolio", portfolio);*/
		return "admin.portfolio.detail";
	}
	
}
