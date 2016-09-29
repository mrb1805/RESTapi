package com.jpmc.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.jpmc.entity.PNRDetails;
import com.jpmc.system.RailwayReservationSystem;
import com.jpmc.system.Train;

//content Negotiation - Http header "ACCEPT"
// REST - Representational{XML, JSON} , STATE {Current Number/data in DB}

@Path("/pnr")
public class PNRResource{
	
	@GET
	@Produces({"application/xml","application/json"})
	public PNRDetails getPNRDetails(@QueryParam("pnrNo")long pnrNo){
		RailwayReservationSystem rs=new RailwayReservationSystem();
		PNRDetails pnrDetails=rs.getPNRDetails(pnrNo);
		return pnrDetails;
	}
	
	@Path("/train")
	@GET
	@Produces({"application/xml","application/json"})
	public List<Train> getListofTrains(){
		RailwayReservationSystem rs=new RailwayReservationSystem();
		List<Train> trains = rs.getListofTrains();		
		return trains;	
		}
		
	}
