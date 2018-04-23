package com.webtfolio.entity;

public class Skill {

	private String skillId;
	private String description;
	
	private PortfolioSkill portfolioSkill;
	
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

	public PortfolioSkill getPortfolioSkill() {
		return portfolioSkill;
	}

	public void setPortfolioSkill(PortfolioSkill portfolioSkill) {
		this.portfolioSkill = portfolioSkill;
	}
	
}
