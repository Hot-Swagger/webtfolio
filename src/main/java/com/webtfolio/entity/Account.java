package com.webtfolio.entity;

import java.util.Date;

public class Account {
	
	private String id;
	private String pwd;
	private String email;
	private Date regDate;
	private boolean enabled;
	
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
	
}
