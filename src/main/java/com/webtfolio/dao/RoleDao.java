package com.webtfolio.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Role;

public interface RoleDao {

	@Select("select * from Role where roleId=#{roleId}")
	Role get(String roleId);
	
	@Insert("insert into Role("
			+ "roleId, "
			+ "description) "
			+"values("
			+ "#{roleId},"
			+ "#{description})")
	int insert(Role role);
	
	@Update("update Role set "
			+ "description=#{description} "
			+ "where roleId=#{roleId}")
	int update(Role role);
	
	@Delete("delete from Role where roleId=#{roleId}")
	int delete(String roleId);
}
