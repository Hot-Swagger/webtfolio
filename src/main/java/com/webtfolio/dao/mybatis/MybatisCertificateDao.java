package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.CertificateDao;
import com.webtfolio.entity.Certificate;

@Repository
public class MybatisCertificateDao implements CertificateDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Certificate> getList(String accountId) {
		
		CertificateDao certificateDao = sqlSession.getMapper(CertificateDao.class);
		List<Certificate> result = certificateDao.getList(accountId);
		return result;
	}

	@Override
	public Certificate get(int id) {
		CertificateDao certificateDao = sqlSession.getMapper(CertificateDao.class);
		Certificate result = certificateDao.get(id);
		return result;
	}

	@Override
	public int insert(Certificate certificate) {
		CertificateDao certificateDao = sqlSession.getMapper(CertificateDao.class);
		int result = certificateDao.insert(certificate);
		return result;
	}

	@Override
	public int update(Certificate certificate) {
		CertificateDao certificateDao = sqlSession.getMapper(CertificateDao.class);
		int result = certificateDao.update(certificate);
		return result;
	}

	@Override
	public int delete(int id) {
		CertificateDao certificateDao = sqlSession.getMapper(CertificateDao.class);
		int result = certificateDao.delete(id);
		return result;
	}

}
