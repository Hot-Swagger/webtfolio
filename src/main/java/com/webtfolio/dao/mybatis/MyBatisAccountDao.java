package com.webtfolio.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webtfolio.dao.AccountDao;
import com.webtfolio.entity.Account;

@Repository
public class MyBatisAccountDao implements AccountDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Account get(String id) {
		
		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
		
		Account result = accountDao.get(id);
		
		return result;
	}

	
}
