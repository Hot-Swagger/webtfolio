package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.SkillDao;
import com.webtfolio.dao.SkillViewDao;
import com.webtfolio.entity.SkillView;

@Repository
public class MybatisSkillViewDao implements SkillViewDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<SkillView> getList() {
		SkillViewDao dao = sqlSession.getMapper(SkillViewDao.class);
		List<SkillView> result = dao.getList();
		return result;
	}

}
