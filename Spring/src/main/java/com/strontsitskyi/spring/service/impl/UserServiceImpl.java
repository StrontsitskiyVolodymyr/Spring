package com.strontsitskyi.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.strontsitskyi.spring.dao.UserDao;
import com.strontsitskyi.spring.model.User;
import com.strontsitskyi.spring.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User addUser(User user) {
		return userDao.add(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
	}

	@Override
	public void removeUser(User user) {
		userDao.remove(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAll();
	}

	@Override
	public User getUserById(int id) {
		return userDao.getById(id);
	}

}
