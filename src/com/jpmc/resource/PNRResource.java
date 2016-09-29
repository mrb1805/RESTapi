package com.jpmc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.jpmc.entity.PNRDetails;
import com.jpmc.system.RailwayReservationSystem;

@Path("/pnr")
public class PNRResource{
	
	@GET
	@Produces("application/xml")
	public PNRDetails getPNRDetails(@QueryParam("pnrNo")long pnrNo){
		RailwayReservationSystem rs=new RailwayReservationSystem();
		PNRDetails pnrDetails=rs.getPNRDetails(pnrNo);
		return pnrDetails;
	}
}