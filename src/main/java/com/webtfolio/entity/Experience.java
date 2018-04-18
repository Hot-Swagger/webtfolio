package com.webtfolio.entity;

import java.util.Date;

public class Experience {
	private int id;
	private Date entDate;
	private Date leavDate;
	private boolean inOffice;
	private String company;
	private String position;
	private String business;
	private String detail;
	private Date regDate;
	private String accountId;
	
	public Experience() {
		// TODO Auto-generated constructor stub
	}

	public Experience(int id, Date entDate, Date leavDate, boolean inOffice, String company, String position,
			String business, String detail, String accountId) {
		super();
		this.id = id;
		this.entDate = entDate;
		this.leavDate = leavDate;
		this.inOffice = inOffice;
		this.company = company;
		this.position = position;
		this.business = business;
		this.detail = detail;
		this.accountId = accountId;
	}

	public Experience(int id, Date entDate, Date leavDate, boolean inOffice, String company, String position,
			String business, String detail, Date regDate, String accountId) {
		super();
		this.id = id;
		this.entDate = entDate;
		this.leavDate = leavDate;
		this.inOffice = inOffice;
		this.company = company;
		this.position = position;
		this.business = business;
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

	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public Date getLeavDate() {
		return leavDate;
	}

	public void setLeavDate(Date leavDate) {
		this.leavDate = leavDate;
	}

	public boolean isInOffice() {
		return inOffice;
	}

	public void setInOffice(boolean inOffice) {
		this.inOffice = inOffice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
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
