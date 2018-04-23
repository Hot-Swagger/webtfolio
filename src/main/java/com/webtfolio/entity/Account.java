package com.webtfolio.entity;

import java.util.Date;

public class Account {
	
	private String id;
	private String pwd;
	private String email;
	private Date regDate;
	private boolean enabled;
	
	private AccountRole accountRole;
	private Profile profile;
	private Experience experience;
	private Portfolio portfolio;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String id, String pwd, String email, boolean enabled) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.enabled = enabled;
	}

	public Account(String id, String pwd, String email, Date regDate, boolean enabled) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.regDate = regDate;
		this.enabled = enabled;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public AccountRole getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(AccountRole accountRole) {
		this.accountRole = accountRole;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
}
