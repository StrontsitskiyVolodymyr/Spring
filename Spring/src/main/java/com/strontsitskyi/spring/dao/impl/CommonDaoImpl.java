package com.strontsitskyi.spring.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.strontsitskyi.spring.dao.CommonDao;

@Transactional
@Repository
public abstract class CommonDaoImpl<O> implements CommonDao<O> {
	@Autowired
	private EntityManager entityManager;
	private Class<O> clazz;

	public CommonDaoImpl(Class<O> clazz) {
		this.clazz = clazz;
	}

	public O add(O item) {
		entityManager.persist(item);
		entityManager.flush();
		return item;
	}

	public boolean update(O item) {
		try {
			entityManager.merge(item);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean remove(O item) {
		try {
			entityManager.remove(item);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<O> getAll() {
		return entityManager.createQuery("Select t from " + clazz.getSimpleName() + " t").getResultList();
	}

	public O getById(int key) {
		return entityManager.find(clazz, key);
	}

}
