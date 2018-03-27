package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.Portfolio;

public class PortfolioService {

	@Autowired
	private PortfolioDao portfolioDao;
	
	public List<Portfolio> getPortfolioList(Integer page){
		
		List<Portfolio> result = portfolioDao.getList(page);
		return result;
	}
	
	public Portfolio getPortfolio(Integer id) {
		Portfolio result = portfolioDao.get(id);
		return result;
	}
}
