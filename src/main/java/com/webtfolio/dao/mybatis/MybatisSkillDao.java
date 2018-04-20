package com.webtfolio.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.webtfolio.dao.RoleDao;
import com.webtfolio.dao.SkillDao;
import com.webtfolio.entity.Role;
import com.webtfolio.entity.Skill;

public class MybatisSkillDao implements SkillDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Skill get(String skillId) {
		SkillDao dao = sqlSession.getMapper(SkillDao.class);
		Skill result = dao.get(skillId);
		return result;
	}

	@Override
	public int insert(Skill skill) {
		SkillDao dao = sqlSession.getMapper(SkillDao.class);
		int result = dao.insert(skill);
		return result;
	}

	@Override
	public int update(Skill skill) {
		SkillDao dao = sqlSession.getMapper(SkillDao.class);
		int result = dao.update(skill);
		return result;
	}

	@Override
	public int delete(String skillId) {
		SkillDao dao = sqlSession.getMapper(SkillDao.class);
		int result = dao.delete(skillId);
		return result;
	}

}
