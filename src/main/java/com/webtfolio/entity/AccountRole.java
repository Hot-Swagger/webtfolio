package com.webtfolio.entity;

import java.util.Date;

public class AccountRole {

	private String accountId;
	private String roleId;
	private String regAdmin;
	private Date regDate;
	private boolean defaultRole;
	
	public AccountRole() {
		// TODO Auto-generated constructor stub
	}

	public AccountRole(String accountId, String roleId, String regAdmin, boolean defaultRole) {
		super();
		this.accountId = accountId;
		this.roleId = roleId;
		this.regAdmin = regAdmin;
		this.defaultRole = defaultRole;
	}

	public AccountRole(String accountId, String roleId, String regAdmin, Date regDate, boolean defaultRole) {
		super();
		this.accountId = accountId;
		this.roleId = roleId;
		this.regAdmin = regAdmin;
		this.regDate = regDate;
		this.defaultRole = defaultRole;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRegAdmin() {
		return regAdmin;
	}

	public void setRegAdmin(String regAdmin) {
		this.regAdmin = regAdmin;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public boolean isDefaultRole() {
		return defaultRole;
	}

	public void setDefaultRole(boolean defaultRole) {
		this.defaultRole = defaultRole;
	}
	
}
