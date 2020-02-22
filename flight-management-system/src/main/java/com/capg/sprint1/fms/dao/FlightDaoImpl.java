package com.capg.sprint1.fms.dao;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.fms.model.Airport;
import com.capg.sprint1.fms.model.Flight;

public class FlightDaoImpl implements FlightDao {
	
	Map<Long, Flight> Flight=new HashMap<Long, Flight>();
	
	public FlightDaoImpl() {
		addDetails();
		// TODO Auto-generated constructor stub
	}

	public void addDetails() {
	Flight f1=new Flight(1234,"airline","ghjk",89);
	Flight f2=new Flight(7845,"airline","bhtd",96);
	Flight.put(f1.getFlightNumber(),f1);
	Flight.put(f2.getFlightNumber(),f2);
	}
	
	

	public Flight modifyByFlightNumber(long flightNumber) throws FlightException{
		 if(!Flight.containsKey(flightNumber)) {
			 throw new FlightException("Flight not found");
		  }
		 
	//		Flight f =FlightNo.get(flightNumber);
			return null;
			
     }
	
	public boolean cancelByFlightNumber(long flightNumber) throws FlightException  {
		 if(!Flight.containsKey(flightNumber)) {
			 throw new FlightException("Flight not found");
		}
		Flight.remove(flightNumber);
		
     	return true;
		}
 }

	


