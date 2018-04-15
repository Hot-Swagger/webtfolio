package com.webtfolio.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebtfolioMvcConfig implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry
		.addResourceHandler("/resource/**")
		.addResourceLocations("/resource/");
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		converters.add(converter());
	}
	
	@Bean
	public StringHttpMessageConverter converter() {
		
		List<MediaType> mediatype = new ArrayList<>();
        mediatype.add(MediaType.valueOf("text/html;charset=UTF-8"));
		
		StringHttpMessageConverter converter = new StringHttpMessageConverter();
		converter.setSupportedMediaTypes(mediatype);
		return converter;
	}
}
