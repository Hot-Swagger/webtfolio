package com.webtfolio.entity;

import java.util.Date;
import java.util.List;

public class ProfileView extends Profile{

	private long langCertCount;
	private long certCount;
	
	public ProfileView() {
		// TODO Auto-generated constructor stub
	}

	public ProfileView(String accountId, String name, String gender, Date birthday, String address, String school,
			String major, String phone, String email, Date regDate, long langCertCount, long certCount) {
		super(accountId, name, gender, birthday, address, school, major, phone, email, regDate);
		this.langCertCount = langCertCount;
		this.certCount = certCount;
	}

	public long getLangCertCount() {
		return langCertCount;
	}

	public void setLangCertCount(long langCertCount) {
		this.langCertCount = langCertCount;
	}

	public long getCertCount() {
		return certCount;
	}

	public void setCertCount(long certCount) {
		this.certCount = certCount;
	}
	
}
