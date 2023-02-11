package com.alarm.demo.service;

import org.springframework.stereotype.Service;

import com.alarm.demo.model.dao.UserDAO;
import com.alarm.demo.model.dto.common.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserDAO userDAO;

	public User findByUserId(int userId) {
		return userDAO.findByUserId(userId);
	}
}
