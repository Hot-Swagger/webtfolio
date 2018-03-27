package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.Portfolio;

public class MyBatisPortfolioDao implements PortfolioDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Portfolio> getList(Integer page) {
		
		PortfolioDao portfolioDao = sqlSession.getMapper(PortfolioDao.class);
		
		List<Portfolio> result = portfolioDao.getList(page);
		
		return result;
	}

	@Override
	public Portfolio get(Integer id) {

		PortfolioDao portfolioDao = sqlSession.getMapper(PortfolioDao.class);
		
		Portfolio result = portfolioDao.get(id);
		
		return result;
	}

	
}
