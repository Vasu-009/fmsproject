package com.capg.sprint1.fms.service;

import java.time.LocalDateTime;

import com.capg.sprint1.fms.dao.FlightDao;
import com.capg.sprint1.fms.dao.FlightDaoImpl;
import com.capg.sprint1.fms.dao.ScheduledFlightDao;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl;
import com.capg.sprint1.fms.model.Airport;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.Schedule;
import com.capg.sprint1.fms.model.ScheduledFlight;

public class ScheduledFlightServicesImpl implements ScheduledFlightServices {

	ScheduledFlightDao scheduledFlightDao=new ScheduledFlightDaoImpl();

	public ScheduledFlight modifyScheduledFlightByFlightNumber
    (String sourceAirport,String destinationAirport,LocalDateTime arrivalTime,LocalDateTime departureTime,long flightNumber) {
		
	return modifyScheduledFlightByFlightNumber(sourceAirport,destinationAirport,arrivalTime,departureTime,flightNumber);
		
}

	public boolean deleteScheduledFlight(long flightNumber) throws com.capg.sprint1.fms.dao.FlightException {
		
		return scheduledFlightDao.deleteScheduledFlight(flightNumber);
		
    }


	

}
