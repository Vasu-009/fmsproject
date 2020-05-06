package com.capg.sprint1.fms.service;

import java.time.LocalDateTime;

import com.capg.sprint1.fms.dao.FlightException;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.Schedule;
import com.capg.sprint1.fms.model.ScheduledFlight;

public interface ScheduledFlightServices {
	
	public ScheduledFlight modifyScheduledFlightByFlightNumber
    (String sourceAirport,String destinationAirport,LocalDateTime arrivalTime,LocalDateTime departureTime,long flightNumber);
	public boolean deleteScheduledFlight(long flightnumber) throws FlightException;

}
