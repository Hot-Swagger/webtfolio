package com.webtfolio.entity;

public class Role {

	private String roleId;
	private String description;
	
	private AccountRole accountRole;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(String roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AccountRole getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(AccountRole accountRole) {
		this.accountRole = accountRole;
	}
	
}
