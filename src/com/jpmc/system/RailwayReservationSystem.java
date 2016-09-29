package com.jpmc.system;

import com.jpmc.entity.PNRDetails;

public class RailwayReservationSystem {
	
	public PNRDetails getPNRDetails(long pnrNo){
		
		PNRDetails pnrDetails=new PNRDetails();
		pnrDetails.setPnrNo(pnrNo);
		pnrDetails.setPassengerName("John Smith");
		pnrDetails.setStatus("Waiting 999/99");
		return pnrDetails;
	}

}
