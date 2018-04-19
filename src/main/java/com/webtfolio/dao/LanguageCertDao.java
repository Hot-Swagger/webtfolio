package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.LanguageCert;

public interface LanguageCertDao {

	@Select("select * from LanguageCert "
			+ "where profileId=#{profileId} "
			+ "order by pubDate desc")
	List<LanguageCert> getList(int profileId);
	
	@Select("select * from LanguageCert where id=#{id}")
	LanguageCert get(int id);
	
	@Insert("insert into LanguageCert("
			+ "name, "
			+ "certNo, "
			+ "publisher, "
			+ "level, "
			+ "score, "
			+ "pubDate, "
			+ "effDate, "
			+ "profileId) "
			+"values("
			+ "#{name},"
			+ "#{certNo},"
			+ "#{publisher},"
			+ "#{level},"
			+ "#{score},"
			+ "#{pubDate},"
			+ "#{effDate},"
			+ "#{profileId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(LanguageCert languageCert);
	
	@Update("update LanguageCert set "
			+ "name=#{name}, "
			+ "certNo=#{certNo}, "
			+ "publisher=#{publisher}, "
			+ "level=#{level}, "
			+ "score=#{score}, "
			+ "pubDate=#{pubDate}, "
			+ "effDate=#{effDate}, "
			+ "profileId=#{profileId} "
			+ "where id=#{id}")
	int update(LanguageCert languageCert);
	
	@Delete("delete from LanguageCert where id=#{id}")
	int delete(int id);
	
}
