package com.webtfolio.dao;

import com.webtfolio.entity.Role;

public interface RoleDao {

	Role get(String roleId);
	
	int insert(Role role);
	
	int update(Role role);
	
	int delete(String roleId);
}
