package com.yun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yun.dao.UserDao;
import com.yun.user.User;

@Controller
public class Lcontroller {
	@Autowired
	public UserDao userDao;
	
	@ResponseBody
	@RequestMapping("/login")
	public User login() {
		User user=userDao.findUserById("1");
		System.out.println(user);
		return user;
	}
}
