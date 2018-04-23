package com.webtfolio.entity;

public class PortfolioSkill {

	private int id;
	private String skillId;
	private int portfolioId;
	
	private Portfolio portfolio;
	private Skill skill;
	
	public PortfolioSkill() {
		// TODO Auto-generated constructor stub
	}

	public PortfolioSkill(String skillId, int portfolioId) {
		super();
		this.skillId = skillId;
		this.portfolioId = portfolioId;
	}

	public PortfolioSkill(int id, String skillId, int portfolioId) {
		super();
		this.id = id;
		this.skillId = skillId;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
