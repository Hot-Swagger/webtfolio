package com.webtfolio.dao;

import com.webtfolio.entity.Skill;

public interface SkillDao {

	Skill get(String skillId);
	
	int insert(Skill skill);
	
	int update(Skill skill);
	
	int delete(String skillId);
}
