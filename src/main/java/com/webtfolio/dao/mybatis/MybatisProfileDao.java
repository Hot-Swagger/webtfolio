package com.webtfolio.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.ProfileDao;
import com.webtfolio.entity.Profile;

@Repository
public class MybatisProfileDao implements ProfileDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Profile get(String accountId) {
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		Profile result = dao.get(accountId);
		return result;
	}

	@Override
	public int insert(Profile profile) {
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		int result = dao.insert(profile);
		return result;
	}

	@Override
	public int update(Profile profile) {
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		int result = dao.update(profile);
		return result;
	}

	@Override
	public int delete(int id) {
		ProfileDao dao = sqlSession.getMapper(ProfileDao.class);
		int result = dao.delete(id);
		return result;
	}

}
