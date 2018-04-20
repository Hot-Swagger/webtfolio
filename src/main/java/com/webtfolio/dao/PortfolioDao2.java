package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Portfolio2;

public interface PortfolioDao2 {

	@Select("select * from Portfolio "
			+ "where accountId=#{accountId} order by regDate desc "
			+ "limit ${(page-1)*9},9")
	List<Portfolio2> getList(String accountId, @Param("page")Integer page);
	
	@Select("select * from Portfolio "
			+ "where accountId=#{accountId} and category=#{category} order by regDate desc "
			+ "limit ${(page-1)*9},9")
	List<Portfolio2> getCategoryList(String accountId, String category, @Param("page")Integer page);
	
	@Select("select * from Portfolio where id=#{id}")
	Portfolio2 get(Integer id);
	
	@Insert("insert into Portfolio("
			+ "title, "
			+ "category, "
			+ "devPeriod, "
			+ "persons, "
			+ "role, "
			+ "detail, "
			+ "accountId) "
			+"values("
			+ "#{title},"
			+ "#{category},"
			+ "#{devPeriod},"
			+ "#{persons},"
			+ "#{role},"
			+ "#{detail},"
			+ "#{accountId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(Portfolio2 portfolio);
	
	@Update("update Portfolio set "
			+ "title=#{title}, "
			+ "category=#{category}, "
			+ "devPeriod=#{devPeriod}, "
			+ "persons=#{persons}, "
			+ "role=#{role}, "
			+ "detail=#{detail}, "
			+ "regDate=#{regDate}, "
			+ "accountId=#{accountId} "
			+ "where id=#{id}")
	int update(Portfolio2 portfolio);
	
	@Delete("delete from Portfolio where id=#{id}")
	int delete(int id);
}
