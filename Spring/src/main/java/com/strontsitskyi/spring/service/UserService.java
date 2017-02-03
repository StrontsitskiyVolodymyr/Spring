package com.strontsitskyi.spring.service;

import java.util.List;

import com.strontsitskyi.spring.model.User;

public interface UserService {

	public User addUser(User user);

	public void updateUser(User user);

	public void removeUser(User user);

	public List<User> getAllUsers();

	public User getUserById(int id);
}
