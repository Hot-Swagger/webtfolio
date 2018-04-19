package com.webtfolio.dao;

import java.util.List;

import com.webtfolio.entity.PortfolioSkill;

public interface PortfolioSkillDao {

	List<PortfolioSkill> getList(Integer portfolioId, Integer page);
	
	PortfolioSkill get(Integer id);
	
	int insert(PortfolioSkill portfolioSkill);
	
	int update(PortfolioSkill portfolioSkill);
	
	int delete(int id);
}
