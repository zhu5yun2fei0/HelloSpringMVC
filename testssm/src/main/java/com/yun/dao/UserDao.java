package com.yun.dao;

import com.yun.user.User;

public interface UserDao {
	public User findUserById(String id);
}
