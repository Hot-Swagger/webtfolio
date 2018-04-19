package com.webtfolio.dao;

import org.apache.ibatis.annotations.Select;

import com.webtfolio.entity.Account;

public interface AccountDao {

	@Select("select * from Account where id=#{id}")
	Account get(String id);
	
}
