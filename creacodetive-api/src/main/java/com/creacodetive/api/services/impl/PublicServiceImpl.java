package com.creacodetive.api.services.impl;

import javax.ws.rs.core.Response;

import com.creacodetive.api.services.PublicService;

/**
 * Public Service Implementation Class
 * 
 * @author Daniel I. Khan Ramiro (di.khan.r@gmail.com)
 */
public class PublicServiceImpl implements PublicService {

	public Response printMessage(String msg) 
	{
		String result = "Restful example: " + msg;
		return Response.status(200).entity(result).build();
	}

}
