package com.jpmc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Naming convention followed is Rest WebServices is Resource
@Path("/hello")
public class HelloWorldResource {

	@GET()
	public String sayHello() {
		 return "Hello from Rest Webservice";
	}
}
