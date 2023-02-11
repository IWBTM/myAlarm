package com.alarm.demo.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.alarm.demo.model.dto.common.User;

@Mapper
public interface UserDAO {

	User findByUserId(int userId);
}
