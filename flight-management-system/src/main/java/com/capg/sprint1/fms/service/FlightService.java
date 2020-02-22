package com.capg.sprint1.fms.service;

import java.math.BigInteger;

import com.capg.sprint1.fms.dao.FlightException;
import com.capg.sprint1.fms.model.Flight;

public interface FlightService {
	
	public  Flight modifyByFlightNumber(long flightNumber) throws FlightException ;
	public boolean cancelByFlightNumber(long flightNumber) throws FlightException;
}
