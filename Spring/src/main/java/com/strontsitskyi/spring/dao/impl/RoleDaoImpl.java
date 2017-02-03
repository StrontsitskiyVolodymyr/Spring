package com.strontsitskyi.spring.dao.impl;

import com.strontsitskyi.spring.dao.RoleDao;
import com.strontsitskyi.spring.model.Role;

public class RoleDaoImpl extends CommonDaoImpl<Role> implements RoleDao {

	public RoleDaoImpl(Class<Role> clazz) {
		super(clazz);
	}

}
