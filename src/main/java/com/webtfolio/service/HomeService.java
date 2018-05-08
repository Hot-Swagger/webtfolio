package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.webtfolio.dao.ImageDao;
import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.Image;
import com.webtfolio.entity.Portfolio;

@Service
public class HomeService {
	/*인덱스 페이지 select 서비스 구현*/
	/*로그인 페이지 인증 서비스 구현*/
	@Autowired
	private PortfolioDao portfolioDao;
	@Autowired
	private ImageDao imageDao;
	
	@Transactional
	public void getPortfolioList(String id, Integer page, Model model){
		
		List<Portfolio> portfolioList = portfolioDao.getList(id, page);
		List<Image> imgList = imageDao.getMainList();
		model.addAttribute("portList", portfolioList);
		model.addAttribute("imgList", imgList);
	}
}
