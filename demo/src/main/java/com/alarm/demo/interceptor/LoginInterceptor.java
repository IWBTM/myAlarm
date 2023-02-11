package com.alarm.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.alarm.demo.model.dto.common.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		HttpSession reqSession = request.getSession();
		User principal = (User) reqSession.getAttribute("principal");
		if (principal == null) {
			System.out.println("절루 끄지세연");
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
