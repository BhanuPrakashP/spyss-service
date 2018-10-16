package com.spyss.springboot.spysswebApp.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
		
		authenticationManagerBuilder.inMemoryAuthentication().withUser("spyssadmin").password("spyssadmin").roles("ADMIN");
		authenticationManagerBuilder.inMemoryAuthentication().withUser("spyssuser").password("spyssuser").roles("USER");
		
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		
		httpSecurity.authorizeRequests().anyRequest().permitAll().and().httpBasic();
		
	}
	
}
