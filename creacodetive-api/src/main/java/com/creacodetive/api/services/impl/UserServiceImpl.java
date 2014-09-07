package com.creacodetive.api.services.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import com.creacodetive.api.managers.UserManager;
import com.creacodetive.api.services.UserService;
import com.creacodetive.model.User;
import com.google.inject.Inject;

/**
 * User Service Implementation Class
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class UserServiceImpl implements UserService{

	@Inject
	private UserManager userManager;
	
	public Response insertUser(User user) 
	{
		userManager.insertUser(user);
		return Response.status(200).entity(user).build();
		
	}
	
	public Response getUserById(Integer userId) 
	{
		User user = userManager.getUserById(userId);
		return Response.status(200).entity(user).build();
	}

	public Response getAllUsers() 
	{
		List<User> users = userManager.getAllUsers();
		return Response.status(200).entity(users).build();
	}

	public Response updateUser(Integer userId, User user) 
	{
		userManager.updateUser(userId, user);
		return Response.status(200).entity(user).build();
	}

	public Response deleteUser(Integer userId) 
	{
		userManager.deleteUser(userId);
		return Response.status(200).entity(userId).build();
	}
	
}
