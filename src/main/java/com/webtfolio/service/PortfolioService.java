package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webtfolio.dao.PortfolioDao2;
import com.webtfolio.entity.Portfolio2;

@Service
public class PortfolioService {
	/*포트폴리오 페이지 select 서비스 구현*/
	@Autowired
	private PortfolioDao2 portfolioDao2;
	
	@Transactional
	public List<Portfolio2> getPortfolioList(String id, Integer page){
		
		List<Portfolio2> result = portfolioDao2.getList(id, page);
		return result;
	}
	
	@Transactional
	public Portfolio2 getPortfolio(Integer id) {
		Portfolio2 result = portfolioDao2.get(id);
		return result;
	}
}
