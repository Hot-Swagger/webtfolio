package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.Portfolio;

@Repository
public class MybatisPortfolioDao implements PortfolioDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Portfolio> getList(String accountId, Integer page) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		List<Portfolio> result = dao.getList(accountId, page);
		return result;
	}

	@Override
	public List<Portfolio> getCategoryList(String accountId, String category, Integer page) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		List<Portfolio> result = dao.getCategoryList(accountId, category, page);
		return result;
	}

	@Override
	public Portfolio get(Integer id) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		Portfolio result = dao.get(id);
		return result;
	}

	@Override
	public int insert(Portfolio portfolio) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		int result = dao.insert(portfolio);
		return result;
	}

	@Override
	public int update(Portfolio portfolio) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		int result = dao.update(portfolio);
		return result;
	}

	@Override
	public int delete(Integer id) {
		PortfolioDao dao = sqlSession.getMapper(PortfolioDao.class);
		int result = dao.delete(id);
		return result;
	}
	
}
