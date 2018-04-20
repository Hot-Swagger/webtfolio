package com.webtfolio.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Profile;

public interface ProfileDao {

	@Select("select * from Profile where id=#{id}")
	Profile get(String accountId);
	
	@Insert("insert into Profile("
			+ "accountId, "
			+ "name, "
			+ "gender, "
			+ "birthDay, "
			+ "address, "
			+ "school, "
			+ "major, "
			+ "phone, "
			+ "email) "
			+"values("
			+ "#{accountId},"
			+ "#{name},"
			+ "#{gender},"
			+ "#{birthDay},"
			+ "#{address},"
			+ "#{school},"
			+ "#{major},"
			+ "#{phone},"
			+ "#{email})")
	int insert(Profile profile);
	
	@Update("update Profile set "
			+ "name=#{name}, "
			+ "gender=#{gender}, "
			+ "birthDay=#{birthDay}, "
			+ "address=#{address}, "
			+ "school=#{school}, "
			+ "major=#{major}, "
			+ "phone=#{phone}, "
			+ "email=#{email}, "
			+ "regDate=#{regDate} "
			+ "where accountId=#{accountId}")
	int update(Profile profile);
	
	@Delete("delete from Profile where accountId=#{accountId}")
	int delete(int id);
}
