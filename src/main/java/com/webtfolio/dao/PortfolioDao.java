package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.webtfolio.entity.Portfolio;

public interface PortfolioDao {

	@Select("select * from Note limit ${(page-1)*15},15")
	List<Portfolio> getList(@Param("page") Integer page);
	
	Portfolio get(Integer id);
}
