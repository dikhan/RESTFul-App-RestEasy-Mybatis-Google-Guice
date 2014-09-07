package com.creacodetive.orm.dao.impl;

import java.util.List;

import com.creacodetive.model.User;
import com.creacodetive.orm.dao.UserDAO;
import com.creacodetive.orm.mappers.UserMapper;
import com.google.inject.Inject;

/**
 * Data Access Object Impl for services related operations.
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class UserDAOImpl implements UserDAO
{
    
    @Inject
    private UserMapper mapper;

	@Override
	public void insertUser(User user) {
		mapper.insertUser(user);
	}

	@Override
	public User getUserById(Integer userId) {
		return mapper.getUserById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return mapper.getAllUsers();
	}

	@Override
	public void updateUser(User user) {
		mapper.updateUser(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		mapper.deleteUser(userId);
	}

}
