package com.creacodetive.api.managers.impl;

import java.util.List;

import com.creacodetive.api.managers.UserManager;
import com.creacodetive.model.User;
import com.creacodetive.orm.dao.UserDAO;
import com.google.inject.Inject;

/**
 * User Manager Implementation Class
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class UserManagerImpl implements UserManager {

	@Inject
	private UserDAO userDAO;
	
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

	public User getUserById(Integer userId) {
		return userDAO.getUserById(userId);
	}

	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	public void updateUser(Integer userId, User user) {
		userDAO.updateUser(user);
	}

	public void deleteUser(Integer userId) {
		userDAO.deleteUser(userId);	
	}

}
