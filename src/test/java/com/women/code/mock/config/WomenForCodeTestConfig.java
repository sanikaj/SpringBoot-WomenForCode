/**
 * 
 */
package com.women.code.mock.config;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

import com.women.WomenForCodeApplication;
import com.women.code.controller.QueryDb;
import com.women.code.controller.UserRepository;

/**
 * @author sanika
 *
 */
@Configuration
@Profile("test")
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = { "com.women.code" }, excludeFilters = {
		@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WomenForCodeApplication.class) })
public class WomenForCodeTestConfig {
	public WomenForCodeTestConfig() {
		MockitoAnnotations.initMocks(this);
	}

	@Mock
	private QueryDb queryDb;

	@Mock 
	private UserRepository userRepository; 
	
	@Bean
	public QueryDb getQueryDb() {
		return queryDb;
	}
	
	@Bean
	public UserRepository getUserRepository() {
		return userRepository;
	}

}
