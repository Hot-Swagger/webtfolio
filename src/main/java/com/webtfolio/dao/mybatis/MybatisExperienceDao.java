package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.ExperienceDao;
import com.webtfolio.entity.Experience;

@Repository
public class MybatisExperienceDao implements ExperienceDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Experience> getList(String accountId) {
		ExperienceDao experienceDao = sqlSession.getMapper(ExperienceDao.class);
		List<Experience> result = experienceDao.getList(accountId);
		return result;
	}

	@Override
	public Experience get(int id) {
		ExperienceDao experienceDao = sqlSession.getMapper(ExperienceDao.class);
		Experience result = experienceDao.get(id);
		return result;
	}

	@Override
	public int insert(Experience experience) {
		ExperienceDao experienceDao = sqlSession.getMapper(ExperienceDao.class);
		int result = experienceDao.insert(experience);
		return result;
	}

	@Override
	public int update(Experience experience) {
		ExperienceDao experienceDao = sqlSession.getMapper(ExperienceDao.class);
		int result = experienceDao.update(experience);
		return result;
	}

	@Override
	public int delete(int id) {
		ExperienceDao experienceDao = sqlSession.getMapper(ExperienceDao.class);
		int result = experienceDao.delete(id);
		return result;
	}

}
