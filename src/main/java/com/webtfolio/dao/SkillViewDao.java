package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.webtfolio.entity.SkillView;

public interface SkillViewDao {

	@Select("select skillId, count(skillId) count from Skill group by skillId order by count desc")
	List<SkillView> getList();

}
