package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.webtfolio.entity.AccountRole;

public interface AccountRoleDao {

	@Select("select * from AccountRole where accountId=#{accountId}")
	List<AccountRole> getList(String accountId);
	
	@Select("select * from AccountRole where accountId=#{accountId} and defaultRole=1")
	AccountRole getDefaultRole(String accountId);
	
}
