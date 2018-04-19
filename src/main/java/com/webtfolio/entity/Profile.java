package com.webtfolio.entity;

import java.util.Date;

public class Profile {

	private String accountId;
	private String name;
	private String gender;
	private Date birthDay;
	private String address;
	private String school;
	private String major;
	private String phone;
	private String email;
	private Date regDate;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String accountId, String name, String gender, Date birthDay, String address, String school,
			String major, String phone, String email) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.address = address;
		this.school = school;
		this.major = major;
		this.phone = phone;
		this.email = email;
	}

	public Profile(String accountId, String name, String gender, Date birthDay, String address, String school,
			String major, String phone, String email, Date regDate) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.address = address;
		this.school = school;
		this.major = major;
		this.phone = phone;
		this.email = email;
		this.regDate = regDate;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

}
