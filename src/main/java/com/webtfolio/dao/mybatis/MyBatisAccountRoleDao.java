package com.webtfolio.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.AccountRoleDao;
import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.AccountRole;
import com.webtfolio.entity.Portfolio;

@Repository
public class MyBatisAccountRoleDao implements AccountRoleDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<AccountRole> getList(String accountId) {

		AccountRoleDao accountRoleDao = sqlSession.getMapper(AccountRoleDao.class);
		
		List<AccountRole> result = accountRoleDao.getList(accountId);
		
		return result;
	}

	@Override
	public AccountRole getDefaultRole(String accountId) {
		
		AccountRoleDao accountRoleDao = sqlSession.getMapper(AccountRoleDao.class);
		
		AccountRole result = accountRoleDao.getDefaultRole(accountId);
		
		return result;
	}

	
}
