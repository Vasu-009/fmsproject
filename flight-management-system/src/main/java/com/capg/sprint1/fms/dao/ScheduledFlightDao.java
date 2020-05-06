package com.capg.sprint1.fms.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.capg.sprint1.fms.model.Airport;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.Schedule;

public interface ScheduledFlightDao {
	
	public boolean modifyScheduledFlightByFlightNumber
    (String sourceAirport,String destinationAirport,LocalDateTime arrivalTime,LocalDateTime departureTime,long flightNumber) throws FlightException;
	public boolean deleteScheduledFlight(long flightnumber)throws FlightException;
//	public boolean modifySourceAirport(String sourceAirport);

}
