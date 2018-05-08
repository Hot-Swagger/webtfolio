package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.webtfolio.dao.CertificateDao;
import com.webtfolio.dao.ExperienceDao;
import com.webtfolio.dao.ProfileDao;
import com.webtfolio.entity.Certificate;
import com.webtfolio.entity.Experience;
import com.webtfolio.entity.Profile;

@Service
public class ProfileService {
	/*프로필 페이지 select 서비스 구현*/
	@Autowired
	CertificateDao certDao;
	@Autowired
	ExperienceDao expDao;
	@Autowired
	ProfileDao profileDao;
	
	@Transactional
	public void getProfile(String accountId, Model model) {
		
		Profile pro = profileDao.get(accountId);
		List<Certificate> certList = certDao.getList(accountId);
		List<Experience> expList = expDao.getList(accountId);
		model.addAttribute("profile", pro);
		model.addAttribute("certList", certList);
		model.addAttribute("expList", expList);
		
	}
}
