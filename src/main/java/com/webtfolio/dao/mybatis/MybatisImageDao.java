package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.ImageDao;
import com.webtfolio.entity.Image;

@Repository
public class MybatisImageDao implements ImageDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Image> getList(int portfolioId) {
		ImageDao imageDao = sqlSession.getMapper(ImageDao.class);
		List<Image> result = imageDao.getList(portfolioId);
		return result;
	}

	@Override
	public Image get(int id) {
		ImageDao imageDao = sqlSession.getMapper(ImageDao.class);
		Image result = imageDao.get(id);
		return result;
	}

	@Override
	public int insert(Image image) {
		ImageDao imageDao = sqlSession.getMapper(ImageDao.class);
		int result = imageDao.insert(image);
		return result;
	}

	@Override
	public int update(Image image) {
		ImageDao imageDao = sqlSession.getMapper(ImageDao.class);
		int result = imageDao.update(image);
		return result;
	}

	@Override
	public int delete(int id) {
		ImageDao imageDao = sqlSession.getMapper(ImageDao.class);
		int result = imageDao.delete(id);
		return result;
	}
	
}
