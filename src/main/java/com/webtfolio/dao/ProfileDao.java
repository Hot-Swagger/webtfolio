package com.webtfolio.dao;

import com.webtfolio.entity.Profile;

public interface ProfileDao {

	Profile get(String accountId);
	
	int insert(Profile profile);
	
	int update(Profile profile);
	
	int delete(int id);
}
