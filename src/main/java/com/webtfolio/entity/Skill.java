package com.webtfolio.entity;

public class Skill {

	private String skillId;
	private String description;
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(String skillId, String description) {
		super();
		this.skillId = skillId;
		this.description = description;
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
