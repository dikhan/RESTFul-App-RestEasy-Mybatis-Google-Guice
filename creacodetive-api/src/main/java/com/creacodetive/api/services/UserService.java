package com.creacodetive.api.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.creacodetive.model.User;

/**
 * RESTEasy Users Service
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
@Path("/users")
public interface UserService {

	/**
	 * @param user
	 * @return 
	 */
	@PUT
	@Consumes("application/json")
	public Response insertUser(User user);
	
	/**
	 * @param userId
	 * @return
	 */
	@GET
	@Produces("application/json")
	@Path("/{userId}")
	public Response getUserById(@PathParam("userId") Integer userId);

	/**
	 * @return
	 */
	@GET
	@Produces
	public Response getAllUsers();

	/**
	 * @param userId
	 * @param user
	 */
	@POST
	@Consumes("application/json")
	@Path("/{userId}") //@NotNull @NotEmpty
	public Response updateUser(@PathParam("userId") Integer userId, User user);

	/**
	 * @param userId
	 */
	@DELETE
	@Consumes("application/json")
	@Path("/{userId}")
	public Response deleteUser(@PathParam("userId") Integer userId);

}
