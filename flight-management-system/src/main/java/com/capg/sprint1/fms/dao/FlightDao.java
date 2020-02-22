package com.capg.sprint1.fms.dao;

import java.math.BigInteger;

import com.capg.sprint1.fms.model.Flight;


public interface FlightDao {
	
	public  Flight modifyByFlightNumber(long flightNumber) throws FlightException;
	public boolean cancelByFlightNumber(long flightNumber) throws FlightException;

}
