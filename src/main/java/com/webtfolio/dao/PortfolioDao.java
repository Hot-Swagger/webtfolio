package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Portfolio;

public interface PortfolioDao {

	@Select("select * from Portfolio "
			+ "where accountId=#{accountId} order by regDate desc "
			+ "limit ${(page-1)*9},9")
	List<Portfolio> getList(@Param("accountId")String accountId, @Param("page")Integer page);
	
	@Select("select * from Portfolio "
			+ "where accountId=#{accountId} and category=#{category} order by regDate desc "
			+ "limit ${(page-1)*9},9")
	List<Portfolio> getCategoryList(@Param("accountId")String accountId, @Param("category")String category, @Param("page")Integer page);
	
	@Select("select * from Portfolio where id=#{id}")
	Portfolio get(Integer id);
	
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
	int insert(Portfolio portfolio);
	
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
	int update(Portfolio portfolio);
	
	@Delete("delete from Portfolio where id=#{id}")
	int delete(Integer id);
}
