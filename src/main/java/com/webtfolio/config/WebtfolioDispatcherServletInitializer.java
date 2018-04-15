package com.webtfolio.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebtfolioDispatcherServletInitializer extends 
				AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {
				WebtfolioSecurityConfig.class
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {
				ServletContextConfig.class,
				WebtfolioMvcConfig.class,
				MybatisConfig.class,
				TilesConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

	@Bean
	public Filter characterEncodingFilter() {
		
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		
		return filter;
	}
	
	@Override
	protected Filter[] getServletFilters() {
		
		return new Filter[] {
				characterEncodingFilter()
		};
	}

}
