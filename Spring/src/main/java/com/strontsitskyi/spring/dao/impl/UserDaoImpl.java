package com.strontsitskyi.spring.dao.impl;

import com.strontsitskyi.spring.dao.UserDao;
import com.strontsitskyi.spring.model.User;

public class UserDaoImpl extends CommonDaoImpl<User> implements UserDao {

	public UserDaoImpl(Class< User> clazz) {
		super(clazz);
	}

}
