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
			+ "matrDate, "
			+ "gradDate, "
			+ "phone, "
			+ "email, "
			+ "website, "
			+ "github, "
			+ "photo, "
			+ "produce) "
			+"values("
			+ "#{accountId},"
			+ "#{name},"
			+ "#{gender},"
			+ "#{birthDay},"
			+ "#{mainJob},"
			+ "#{address},"
			+ "#{school},"
			+ "#{major},"
			+ "#{matrDate},"
			+ "#{gradDate},"
			+ "#{phone},"
			+ "#{email},"
			+ "#{website},"
			+ "#{github},"
			+ "#{photo},"
			+ "#{produce})")
	int insert(Profile profile);
	
	@Update("update Profile set "
			+ "name=#{name}, "
			+ "gender=#{gender}, "
			+ "birthDay=#{birthDay}, "
			+ "mainJob=#{mainJob}, "
			+ "address=#{address}, "
			+ "school=#{school}, "
			+ "major=#{major}, "
			+ "matrDate=#{matrDate}, "
			+ "gradDate=#{gradDate}, "
			+ "phone=#{phone}, "
			+ "email=#{email}, "
			+ "website=#{website}, "
			+ "github=#{github}, "
			+ "photo=#{photo}, "
			+ "produce=#{produce}, "
			+ "regDate=#{regDate} "
			+ "where accountId=#{accountId}")
	int update(Profile profile);
	
	@Delete("delete from Profile where accountId=#{accountId}")
	int delete(int id);
}
