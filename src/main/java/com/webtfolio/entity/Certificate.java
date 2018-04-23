package com.webtfolio.entity;

import java.util.Date;

public class Certificate {

	private int id;
	private String name;
	private String certNo;
	private String publisher;
	private String level;
	private Date pubDate;
	private int profileId;
	
	private Profile profile;
	
	public Certificate() {
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name, String certNo, String publisher, String level, Date pubDate, int profileId) {
		super();
		this.name = name;
		this.certNo = certNo;
		this.publisher = publisher;
		this.level = level;
		this.pubDate = pubDate;
		this.profileId = profileId;
	}

	public Certificate(int id, String name, String certNo, String publisher, String level, Date pubDate,
			int profileId) {
		super();
		this.id = id;
		this.name = name;
		this.certNo = certNo;
		this.publisher = publisher;
		this.level = level;
		this.pubDate = pubDate;
		this.profileId = profileId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
