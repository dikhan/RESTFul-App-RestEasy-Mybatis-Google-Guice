package com.creacodetive.orm.mappers;

import java.util.List;

import com.creacodetive.model.User;

/**
 * User's MyBatis Mapper
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public interface UserMapper {
	 public void insertUser(User user);
	 public User getUserById(Integer userId);
	 public List<User> getAllUsers();
	 public void updateUser(User user);
	 public void deleteUser(Integer userId);
	
}
