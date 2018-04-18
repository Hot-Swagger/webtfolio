package com.webtfolio.entity;

public class PortfolioSkill {

	private int id;
	private String skill;
	private int portfolioId;
	
	public PortfolioSkill() {
		// TODO Auto-generated constructor stub
	}

	public PortfolioSkill(int id, String skill, int portfolioId) {
		super();
		this.id = id;
		this.skill = skill;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}
	
}
