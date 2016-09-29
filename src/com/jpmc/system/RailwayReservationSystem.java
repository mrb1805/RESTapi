package com.jpmc.system;

import java.util.ArrayList;
import java.util.List;

import com.jpmc.entity.PNRDetails;

public class RailwayReservationSystem {
	
	public PNRDetails getPNRDetails(long pnrNo){
		
		PNRDetails pnrDetails=new PNRDetails();
		pnrDetails.setPnrNo(pnrNo);
		pnrDetails.setPassengerName("John Smith");
		pnrDetails.setStatus("Waiting 999/99");
		return pnrDetails;
	}
	
	public List<Train> getListofTrains(){
		
		Train trainDetails = new Train();
		trainDetails.setTrainId(123);
		trainDetails.setSource("Bangalore");
		trainDetails.setDestination("Mysore");
		trainDetails.setTrainName("shatabdi");
		
		Train trainDetails1 = new Train();
		trainDetails1.setTrainId(567);
		trainDetails1.setSource("Delhi");
		trainDetails1.setDestination("Mumbai");
		trainDetails1.setTrainName("Ragdhani");
		
		Train trainDetails2 = new Train();
		trainDetails2.setTrainId(897);
		trainDetails2.setSource("Kolkatta");
		trainDetails2.setDestination("Rajasthan");
		trainDetails2.setTrainName("Samjautha");
		
		List <Train> trains = new ArrayList<>();
		trains.add(trainDetails);
		trains.add(trainDetails1);
		trains.add(trainDetails2);
		
		return trains;	
	}

}
