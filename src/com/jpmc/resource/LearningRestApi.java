package com.jpmc.resource;


import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

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
				public String example05(@PathParam("empnos") String empnos,
						@PathParam("action") String action,
						@MatrixParam("dinner") String dinner,
						@MatrixParam("privilage") String privilage)
				{
					System.out.println(empnos);
					System.out.println(action);
					System.out.println(dinner);
					System.out.println(privilage);
					//add your own println to confirm the working
					return "Response from example 05";
					
				}		
}