package com.strontsitskyi.spring.dao;

import java.util.List;

public interface CommonDao<O> {

	O add(O item);

	boolean update(O item);

	boolean remove(O item);

	List<O> getAll();

	O getById(int key);
}
