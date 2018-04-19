package com.webtfolio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.webtfolio.entity.Image;

public interface ImageDao {

	@Select("select * from Image "
			+ "where portfolioId=#{portfolioId} "
			+ "order by 'order'")
	List<Image> getList(int portfolioId);
	
	@Select("select * from Image where id=#{id}")
	Image get(int id);
	
	@Insert("insert into Image("
			+ "image, "
			+ "mainImage, "
			+ "order, "
			+ "portfolioId) "
			+"values("
			+ "#{image},"
			+ "#{mainImage},"
			+ "#{order},"
			+ "#{portfolioId})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(Image image);
	
	@Update("update Image set "
			+ "image=#{image}, "
			+ "mainImage=#{mainImage}, "
			+ "order=#{order}, "
			+ "portfolioId=#{portfolioId}, "
			+ "where id=#{id}")
	int update(Image image);
	
	@Delete("delete from Image where id=#{id}")
	int delete(int id);
	
}
