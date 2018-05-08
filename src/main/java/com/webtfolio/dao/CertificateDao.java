package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Certificate;

public interface CertificateDao {

	@Select("select * from Certificate "
			+ "where accountId=#{accountId} "
			+ "order by pubDate desc")
	List<Certificate> getList(String accountId);
	
	@Select("select * from Certificate where id=#{id}")
	Certificate get(int id);
	
	@Insert("insert into Certificate("
			+ "name, "
			+ "certNo, "
			+ "publisher, "
			+ "level, "
			+ "pubDate, "
			+ "accountId) "
			+"values("
			+ "#{name},"
			+ "#{certNo},"
			+ "#{publisher},"
			+ "#{level},"
			+ "#{pubDate},"
			+ "#{accountId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(Certificate certificate);
	
	@Update("update Certificate set "
			+ "name=#{name}, "
			+ "certNo=#{certNo}, "
			+ "publisher=#{publisher}, "
			+ "level=#{level}, "
			+ "pubDate=#{pubDate}, "
			+ "accountId=#{accountId} "
			+ "where id=#{id}")
	int update(Certificate certificate);
	
	@Delete("delete from Certificate where id=#{id}")
	int delete(int id);
	
}
