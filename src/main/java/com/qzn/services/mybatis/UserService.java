package com.qzn.services.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qzn.daos.mybatis.UserDao;
import com.qzn.models.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> queryUsers() {
		return userDao.queryUsers();
	}
}