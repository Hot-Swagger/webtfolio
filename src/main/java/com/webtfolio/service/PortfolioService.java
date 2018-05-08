package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.webtfolio.dao.ImageDao;
import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.dao.SkillViewDao;
import com.webtfolio.entity.Image;
import com.webtfolio.entity.Portfolio;
import com.webtfolio.entity.SkillView;

@Service
public class PortfolioService {
	/*포트폴리오 페이지 select 서비스 구현*/
	@Autowired
	private PortfolioDao portfolioDao;
	@Autowired
	private ImageDao imageDao;
	@Autowired
	private SkillViewDao skillViewDao;
	
	@Transactional
	public void getPortfolioList(String id, Integer page, Model model){
		
		List<Portfolio> portfolioList = portfolioDao.getList(id, page);
		List<Image> imgList = imageDao.getMainList();
		List<SkillView> skillList = skillViewDao.getList();
		model.addAttribute("portList", portfolioList);
		model.addAttribute("imgList", imgList);
		model.addAttribute("skillList", skillList);
	}
	
	@Transactional
	public Portfolio getPortfolio(Integer id) {
		Portfolio result = portfolioDao.get(id);
		return result;
	}
}
