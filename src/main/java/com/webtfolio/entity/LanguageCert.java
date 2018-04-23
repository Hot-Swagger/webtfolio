package com.webtfolio.entity;

import java.util.Date;

public class LanguageCert {

	private int id;
	private String name;
	private String certNo;
	private String publisher;
	private String level;
	private int score;
	private Date pubDate;
	private Date effDate;
	private int profileId;
	
	private Profile profile;
	
	public LanguageCert() {
		// TODO Auto-generated constructor stub
	}

	public LanguageCert(String name, String certNo, String publisher, String level, int score, Date pubDate,
			Date effDate, int profileId) {
		super();
		this.name = name;
		this.certNo = certNo;
		this.publisher = publisher;
		this.level = level;
		this.score = score;
		this.pubDate = pubDate;
		this.effDate = effDate;
		this.profileId = profileId;
	}

	public LanguageCert(int id, String name, String certNo, String publisher, String level, int score, Date pubDate,
			Date effDate, int profileId) {
		super();
		this.id = id;
		this.name = name;
		this.certNo = certNo;
		this.publisher = publisher;
		this.level = level;
		this.score = score;
		this.pubDate = pubDate;
		this.effDate = effDate;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
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
