package com.webtfolio.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.ProfileDao;
import com.webtfolio.dao.RoleDao;
import com.webtfolio.entity.Profile;
import com.webtfolio.entity.Role;

@Repository
public class MybatisRoleDao implements RoleDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Role get(String roleId) {
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		Role result = dao.get(roleId);
		return result;
	}

	@Override
	public int insert(Role role) {
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.insert(role);
		return result;
	}

	@Override
	public int update(Role role) {
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.update(role);
		return result;
	}

	@Override
	public int delete(String roleId) {
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.delete(roleId);
		return result;
	}

}
