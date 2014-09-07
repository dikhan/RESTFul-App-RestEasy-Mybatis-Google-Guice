package com.creacodetive.api.managers;

import java.util.List;
import com.creacodetive.model.User;

/**
 * User Manager Class
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public interface UserManager {
	
	public void insertUser(User user);
	public User getUserById(Integer userId);
	public List<User> getAllUsers();
	public void updateUser(Integer userId, User user);
	public void deleteUser(Integer userId);

}
