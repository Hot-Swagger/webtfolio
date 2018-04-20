package com.webtfolio.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtfolio.dao.CertificateDao;
import com.webtfolio.dao.ExperienceDao;
import com.webtfolio.dao.LanguageCertDao;
import com.webtfolio.dao.ProfileDao;

@Service("adminProfileService")
public class ProfileService {
	/*관리자 프로필 페이지 insert, update, delete 서비스 구현*/
	@Autowired
	private CertificateDao certificateDao;
	@Autowired
	private ExperienceDao experienceDao;
	@Autowired
	private LanguageCertDao languageCertDao;
	@Autowired
	private ProfileDao	profileDao;
	
}