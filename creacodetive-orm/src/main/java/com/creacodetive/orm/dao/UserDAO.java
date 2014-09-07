package com.creacodetive.orm.dao;

import java.util.List;
import com.creacodetive.model.User;

/**
 * Data Access Object for services related operations.
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public interface UserDAO
{
	 public void insertUser(User user);
	 public User getUserById(Integer userId);
	 public List<User> getAllUsers();
	 public void updateUser(User user);
	 public void deleteUser(Integer userId);
}
