package com.webtfolio.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan("com.webtfolio.config")
public class WebtfolioSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.csrf().disable()
			.authorizeRequests()
			//--------------------------------
			//.antMatchers("/*","/profile/**","/experience/**","/portfolio/**").permitAll()
			//.antMatchers("/resource/**").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")	//	.access("hasRole('AUTHOR') or hasRole('ADMIN')")
			//--------------------------------
			//.anyRequest().authenticated()	// 모든요청에 인증이 필요하게 설정하는 내용
			.and()
		.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/login")	// 요청 URL이름을 변경하는 기능
			.and()
		.logout()
			.logoutSuccessUrl("/index")
			.invalidateHttpSession(true);
			
	
	}
	
	/*이것만 설정하면 디폴트 로그인창으로 이동하여 인증할수 있다.
	  <http auto-config="true"> */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select id, pwd password, enabled from Account where id=?")
		.authoritiesByUsernameQuery("select accountId id, roleId authority from AccountRole where accountId=?")
		.passwordEncoder(new BCryptPasswordEncoder());
		
		/*비밀번호 암호화 없이 사용하도록 해주는 내용 (4.0버전 이후 사라짐)
		UserBuilder users = User.withDefaultPasswordEncoder();*/
		
		/*UserBuilder users = User.builder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("dskim").password("{noop}dskim").roles("ADMIN"));*/
	}
}
