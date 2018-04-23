package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.dao.PortfolioSkillDao;
import com.webtfolio.entity.Portfolio;
import com.webtfolio.entity.PortfolioSkill;

@Repository
public class MybatisPortfolioSkillDao implements PortfolioSkillDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<PortfolioSkill> getList(int portfolioId) {
		PortfolioSkillDao dao = sqlSession.getMapper(PortfolioSkillDao.class);
		List<PortfolioSkill> result = dao.getList(portfolioId);
		return result;
	}

	@Override
	public PortfolioSkill get(int id) {
		PortfolioSkillDao dao = sqlSession.getMapper(PortfolioSkillDao.class);
		PortfolioSkill result = dao.get(id);
		return result;
	}

	@Override
	public int insert(PortfolioSkill portfolioSkill) {
		PortfolioSkillDao dao = sqlSession.getMapper(PortfolioSkillDao.class);
		int result = dao.insert(portfolioSkill);
		return result;
	}

	@Override
	public int update(PortfolioSkill portfolioSkill) {
		PortfolioSkillDao dao = sqlSession.getMapper(PortfolioSkillDao.class);
		int result = dao.update(portfolioSkill);
		return result;
	}

	@Override
	public int delete(int id) {
		PortfolioSkillDao dao = sqlSession.getMapper(PortfolioSkillDao.class);
		int result = dao.delete(id);
		return result;
	}
	
}
