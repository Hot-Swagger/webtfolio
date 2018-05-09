package com.webtfolio.entity;

import java.util.Date;
import java.util.List;

public class Profile {

	private String accountId;
	private String name;
	private String gender;
	private Date birthday;
	private String mainJob;
	private String address;
	private String school;
	private String major;
	private Date matrDate;
	private Date gradDate;
	private String phone;
	private String email;
	private String website;
	private String github;
	private String photo;
	private String produce;
	private Date regDate;
	
	private Account account;
	private List<Certificate> certificates;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String accountId, String name, String gender, Date birthday, String mainJob, String address,
			String school, String major, Date matrDate, Date gradDate, String phone, String email, String website,
			String github, String photo, String produce) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.mainJob = mainJob;
		this.address = address;
		this.school = school;
		this.major = major;
		this.matrDate = matrDate;
		this.gradDate = gradDate;
		this.phone = phone;
		this.email = email;
		this.website = website;
		this.github = github;
		this.photo = photo;
		this.produce = produce;
	}

	public Profile(String accountId, String name, String gender, Date birthday, String mainJob, String address,
			String school, String major, Date matrDate, Date gradDate, String phone, String email, String website,
			String github, String photo, String produce, Date regDate) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.mainJob = mainJob;
		this.address = address;
		this.school = school;
		this.major = major;
		this.matrDate = matrDate;
		this.gradDate = gradDate;
		this.phone = phone;
		this.email = email;
		this.website = website;
		this.github = github;
		this.photo = photo;
		this.produce = produce;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMainJob() {
		return mainJob;
	}

	public void setMainJob(String mainJob) {
		this.mainJob = mainJob;
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

	public Date getMatrDate() {
		return matrDate;
	}

	public void setMatrDate(Date matrDate) {
		this.matrDate = matrDate;
	}

	public Date getGradDate() {
		return gradDate;
	}

	public void setGradDate(Date gradDate) {
		this.gradDate = gradDate;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getProduce() {
		return produce;
	}

	public void setProduce(String produce) {
		this.produce = produce;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}
	
}
