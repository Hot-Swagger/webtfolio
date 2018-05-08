package com.webtfolio.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Profile;

public interface ProfileDao {

	@Select("select * from Profile where accountId=#{accountId}")
	Profile get(String accountId);
	
	@Insert("insert into Profile("
			+ "accountId, "
			+ "name, "
			+ "gender, "
			+ "birthDay, "
			+ "mainJob, "
			+ "address, "
			+ "school, "
			+ "major, "
			+ "phone, "
			+ "email, "
			+ "website, "
			+ "github, "
			+ "photo) "
			+"values("
			+ "#{accountId},"
			+ "#{name},"
			+ "#{gender},"
			+ "#{birthDay},"
			+ "#{mainJob},"
			+ "#{address},"
			+ "#{school},"
			+ "#{major},"
			+ "#{phone},"
			+ "#{email},"
			+ "#{website},"
			+ "#{github},"
			+ "#{photo})")
	int insert(Profile profile);
	
	@Update("update Profile set "
			+ "name=#{name}, "
			+ "gender=#{gender}, "
			+ "birthDay=#{birthDay}, "
			+ "mainJob=#{mainJob}, "
			+ "address=#{address}, "
			+ "school=#{school}, "
			+ "major=#{major}, "
			+ "phone=#{phone}, "
			+ "email=#{email}, "
			+ "website=#{website}, "
			+ "github=#{github}, "
			+ "photo=#{photo}, "
			+ "regDate=#{regDate} "
			+ "where accountId=#{accountId}")
	int update(Profile profile);
	
	@Delete("delete from Profile where accountId=#{accountId}")
	int delete(int id);
}
