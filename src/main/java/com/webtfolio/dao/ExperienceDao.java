package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Experience;

public interface ExperienceDao {

	@Select("select * from Experience "
			+ "where accountId=#{accountId} "
			+ "order by entDate desc")
	List<Experience> getList(String accountId);
	
	@Select("select * from Experience where id=#{id}")
	Experience get(int id);
	
	@Insert("insert into Experience("
			+ "entDate, "
			+ "leavDate, "
			+ "inOffice, "
			+ "company, "
			+ "position, "
			+ "business, "
			+ "detail, "
			+ "accountId) "
			+"values("
			+ "#{entDate},"
			+ "#{leavDate},"
			+ "#{inOffice},"
			+ "#{company},"
			+ "#{position},"
			+ "#{business},"
			+ "#{detail},"
			+ "#{accountId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(Experience experience);
	
	@Update("update Experience set "
			+ "entDate=#{entDate}, "
			+ "leavDate=#{leavDate}, "
			+ "inOffice=#{inOffice}, "
			+ "company=#{company}, "
			+ "position=#{position}, "
			+ "business=#{business}, "
			+ "detail=#{detail}, "
			+ "regDate=#{regDate}, "
			+ "accountId=#{accountId} "
			+ "where id=#{id}")
	int update(Experience experience);
	
	@Delete("delete from Experience where id=#{id}")
	int delete(int id);
	
}
