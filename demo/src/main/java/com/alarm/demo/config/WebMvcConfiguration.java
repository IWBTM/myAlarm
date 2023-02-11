package com.alarm.demo.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alarm.demo.interceptor.LoginInterceptor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Bean
	public FilterRegistrationBean<?> filterBean() {
		FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
	
		registrationBean.setOrder(Integer.MIN_VALUE);
		registrationBean.addUrlPatterns("/api/*");
		return registrationBean;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
			.addInterceptor(new LoginInterceptor())
			.addPathPatterns("/auth/**", "/api/**");
	}
}
