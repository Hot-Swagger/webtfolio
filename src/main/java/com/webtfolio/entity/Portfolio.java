package com.webtfolio.entity;

import java.util.Date;
import java.util.List;

public class Portfolio {

	private int id;
	private String title;
	private String category;
	private String devPeriod;
	private int persons;
	private String role;
	private String detail;
	private Date regDate;
	private String accountId;
	
	public Portfolio() {
		// TODO Auto-generated constructor stub
	}

	public Portfolio(String title, String category, String devPeriod, int persons, String role, String detail,
			String accountId) {
		super();
		this.title = title;
		this.category = category;
		this.devPeriod = devPeriod;
		this.persons = persons;
		this.role = role;
		this.detail = detail;
		this.accountId = accountId;
	}

	public Portfolio(int id, String title, String category, String devPeriod, int persons, String role, String detail,
			Date regDate, String accountId) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.devPeriod = devPeriod;
		this.persons = persons;
		this.role = role;
		this.detail = detail;
		this.regDate = regDate;
		this.accountId = accountId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDevPeriod() {
		return devPeriod;
	}

	public void setDevPeriod(String devPeriod) {
		this.devPeriod = devPeriod;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
}
