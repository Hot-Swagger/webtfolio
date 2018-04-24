package com.webtfolio.entity;

import java.util.Date;
import java.util.List;

public class PortfolioView extends Portfolio {

	private long skillCount;
	private long imageCount;

	private Account account;
	private List<PortfolioSkill> portfolioSkills;
	private List<Image> images;
	
	public PortfolioView() {
		// TODO Auto-generated constructor stub
	}

	public PortfolioView(int id, String title, String category, String devPeriod, int persons, String role,
			String detail, Date regDate, String accountId, long skillCount, long imageCount) {
		super(id, title, category, devPeriod, persons, role, detail, regDate, accountId);
		this.skillCount = skillCount;
		this.imageCount = imageCount;
	}

	public long getSkillCount() {
		return skillCount;
	}

	public void setSkillCount(long skillCount) {
		this.skillCount = skillCount;
	}

	public long getImageCount() {
		return imageCount;
	}

	public void setImageCount(long imageCount) {
		this.imageCount = imageCount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<PortfolioSkill> getPortfolioSkills() {
		return portfolioSkills;
	}

	public void setPortfolioSkills(List<PortfolioSkill> portfolioSkills) {
		this.portfolioSkills = portfolioSkills;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
}
