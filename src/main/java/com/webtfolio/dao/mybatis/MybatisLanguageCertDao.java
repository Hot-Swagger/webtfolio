package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.webtfolio.dao.ImageDao;
import com.webtfolio.dao.LanguageCertDao;
import com.webtfolio.entity.Image;
import com.webtfolio.entity.LanguageCert;

public class MybatisLanguageCertDao implements LanguageCertDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<LanguageCert> getList(int profileId) {
		LanguageCertDao dao = sqlSession.getMapper(LanguageCertDao.class);
		List<LanguageCert> result = dao.getList(profileId);
		return result;
	}

	@Override
	public LanguageCert get(int id) {
		LanguageCertDao dao = sqlSession.getMapper(LanguageCertDao.class);
		LanguageCert result = dao.get(id);
		return result;
	}

	@Override
	public int insert(LanguageCert languageCert) {
		LanguageCertDao dao = sqlSession.getMapper(LanguageCertDao.class);
		int result = dao.insert(languageCert);
		return result;
	}

	@Override
	public int update(LanguageCert languageCert) {
		LanguageCertDao dao = sqlSession.getMapper(LanguageCertDao.class);
		int result = dao.update(languageCert);
		return result;
	}

	@Override
	public int delete(int id) {
		LanguageCertDao dao = sqlSession.getMapper(LanguageCertDao.class);
		int result = dao.delete(id);
		return result;
	}
	
}
