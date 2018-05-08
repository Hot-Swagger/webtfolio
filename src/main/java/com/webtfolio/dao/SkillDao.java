package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Skill;

public interface SkillDao {
	
	@Select("select * from Skill where skillId=#{skillId}")
	Skill get(String skillId);
	
	@Insert("insert into Skill("
			+ "skillId, "
			+ "description) "
			+"values("
			+ "#{skillId},"
			+ "#{description})")
	int insert(Skill skill);
	
	@Update("update Skill set "
			+ "description=#{description} "
			+ "where skillId=#{skillId}")
	int update(Skill skill);
	
	@Delete("delete from Skill where skillId=#{skillId}")
	int delete(String skillId);

}
