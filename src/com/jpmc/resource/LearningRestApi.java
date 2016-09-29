package com.jpmc.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.PathSegment;

@Path("/learning")

public class LearningRestApi 
{
	
	//http://localhost:8080/Proj/rest/learning/ex01?empno=1001&name=Akshay&salary=1000
	@Path("/ex01")
	@GET
	@Produces("text/plain")
	public String example01(@QueryParam("empno") int empno,@QueryParam("name") String name,@QueryParam("salary") double salary)
	{
		//add your own println to confirm the working
		return "Response from example 01";
		
	}
	//http://localhost:8080/Proj/rest/learning/ex02;empno=1001;name=Akshay;salary=1000
	@Path("/ex02")
	@GET
	@Produces("text/plain")
	public String example02(@MatrixParam("empno") int empno,@MatrixParam("name") String name,@MatrixParam("salary") double salary)
	{
		//add your own println to confirm the working
		return "Response from example 02";
		
	}
	
	
	//http://localhost:8080/Proj/rest/learning/ex03/1001/Akshay/1000
		@Path("/ex03/{empno}/{name}/{salary}")
		@GET
		@Produces("text/plain")
		public String example03(@PathParam("empno") int empno,@PathParam("name") String name,@PathParam("salary") double salary)
		{
			//add your own println to confirm the working
			return "Response from example 03";
			
		}
	
		//http://localhost:8080/Proj/rest/learning/ex04/1001/Akshay/1000
				@Path("/ex04/{empno:\\d+}/{name:[a-zA-Z]*}")
				@GET
				@Produces("text/plain")
				public String example04(@PathParam("empno") int empno,@PathParam("name") String name)
				{
					//add your own println to confirm the working
					return "Response from example 04";
					
				}
				
				//http://localhost:8080/Proj/rest/learning/ex05/1001/.../10390/action/Akshay
				//http://localhost:8080/Proj/rest/learning/ex05/1001;dinner=free/1234;dinner=pay/1003;privilage=homedrop/../10390/action/Akshay
				
				@Path("/ex05/{empnos: .+}/action/{action}")
				@GET
				@Produces("text/plain")
				public String example05(@PathParam("empnos") List<PathSegment>	empnos,
						@PathParam("action") String action)
				{
					for(PathSegment empno:empnos){
						System.out.println(empno.getPath());
						System.out.println(empno.getMatrixParameters());
					}
					System.out.println(action);
					//add your own println to confirm the working
					return "Response from example 05";
					
				}
				
				
				//http://localhost:8080/Proj/rest/learning/ex06
				//In Rest Client Body name=Mahesh&email=Majrul@gmail.com
				@Path("/ex06")
				@POST
				@Consumes("application/x-www-form-urlencoded")
				@Produces("text/plain")
				public String example06(
						@FormParam("name") String name,
						@FormParam("email") String email){
					
				System.out.println("name: "+ name+ "email: "+email);
				
				return "Response of Ex06";
				}
				

				//http://localhost:8080/Proj/rest/learning/ex07
				//In this example we will send XML/JSON data from the client to the server using POST method
				//{"id":123,"name":"Mahesh","salary":1230.0}
				@Path("/ex07")
				@POST
				@Consumes({"application/json","application/xml"})
				@Produces("text/plain")
				public String example07(Employee emp){
					System.out.println(emp.getId());
					System.out.println(emp.getName());
					System.out.println(emp.getSalary());
				return "Response of Ex07";
				}
	
}

