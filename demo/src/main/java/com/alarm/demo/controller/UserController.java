package com.alarm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alarm.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@GetMapping("/{userId}")
	public String index(@PathVariable int userId, Model model)	{
		model.addAttribute("user", userService.findByUserId(userId));
		return "index";
	}
}
