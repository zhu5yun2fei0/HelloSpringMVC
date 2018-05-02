package com.test.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dao.Userdao;
import com.test.model.User;

@Controller
public class Lcontroller {
	@Autowired
	Userdao userdao;
	
	@ResponseBody
	@RequestMapping("/login")
	public User login(HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		User user=userdao.findUserById("1");
		System.out.println(user);
		return user;
	}
}
