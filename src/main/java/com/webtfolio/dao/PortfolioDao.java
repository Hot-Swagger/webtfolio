package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.webtfolio.entity.Portfolio;

public interface PortfolioDao {

	@Select("select * from Note order by regDate desc limit ${(page-1)*15},15")
	List<Portfolio> getList(@Param("page") Integer page);
	@Select("select * from Note where id=#{id}")
	Portfolio get(Integer id);
}
