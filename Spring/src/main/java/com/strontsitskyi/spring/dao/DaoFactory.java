package com.strontsitskyi.spring.dao;

import com.strontsitskyi.spring.dao.impl.RoleDaoImpl;
import com.strontsitskyi.spring.dao.impl.UserDaoImpl;
import com.strontsitskyi.spring.model.Role;
import com.strontsitskyi.spring.model.User;

public class DaoFactory {
	private static DaoFactory instance = new DaoFactory();
	private UserDao userDao;
	private RoleDao roleDao;

	private DaoFactory() {
	}

	public UserDao getUserDao() {
		if (userDao == null)
			userDao = new UserDaoImpl(User.class);
		return userDao;
	}

	public RoleDao getRoleDao() {
		if (roleDao == null)
			roleDao = new RoleDaoImpl(Role.class);
		return roleDao;
	}

	public static DaoFactory getInstance() {
		return instance;
	}

}
