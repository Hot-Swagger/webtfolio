package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.PortfolioSkill;

public interface PortfolioSkillDao {

	@Select("select * from PortfolioSkill "
			+ "where portfolioId=#{portfolioId} "
			+ "order by id")
	List<PortfolioSkill> getList(int portfolioId);
	
	@Select("select * from PortfolioSkill where id=#{id}")
	PortfolioSkill get(int id);
	
	@Insert("insert into PortfolioSkill("
			+ "skillId, "
			+ "portfolioId) "
			+"values("
			+ "#{skillId},"
			+ "#{portfolioId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(PortfolioSkill portfolioSkill);
	
	@Update("update PortfolioSkill set "
			+ "skillId=#{skillId}, "
			+ "portfolioId=#{portfolioId} "
			+ "where id=#{id}")
	int update(PortfolioSkill portfolioSkill);
	
	@Delete("delete from PortfolioSkill where id=#{id}")
	int delete(int id);
}
