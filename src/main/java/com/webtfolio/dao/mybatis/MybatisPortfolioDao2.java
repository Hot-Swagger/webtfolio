package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.PortfolioDao2;
import com.webtfolio.entity.Portfolio2;

@Repository
public class MybatisPortfolioDao2 implements PortfolioDao2 {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Portfolio2> getList(String accountId, Integer page) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		List<Portfolio2> result = dao.getList(accountId, page);
		return result;
	}

	@Override
	public List<Portfolio2> getCategoryList(String accountId, String category, Integer page) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		List<Portfolio2> result = dao.getCategoryList(accountId, category, page);
		return result;
	}

	@Override
	public Portfolio2 get(Integer id) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		Portfolio2 result = dao.get(id);
		return result;
	}

	@Override
	public int insert(Portfolio2 portfolio) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		int result = dao.insert(portfolio);
		return result;
	}

	@Override
	public int update(Portfolio2 portfolio) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		int result = dao.update(portfolio);
		return result;
	}

	@Override
	public int delete(int id) {
		PortfolioDao2 dao = sqlSession.getMapper(PortfolioDao2.class);
		int result = dao.delete(id);
		return result;
	}
	
}
