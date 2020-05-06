package com.capg.sprint1.fms.dao;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.fms.model.Airport;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.Schedule;
import com.capg.sprint1.fms.model.ScheduledFlight;

public class ScheduledFlightDaoImpl implements ScheduledFlightDao {
	
	public static Map<Long, Flight> ScheduledFlightDao=new HashMap<Long, Flight>();
	Map<Flight, ScheduledFlight> scheduleList= new HashMap<Flight, ScheduledFlight>();
	Map<String, Schedule> schedule=new HashMap<String,Schedule>();
	Map<Long, Flight> Flight=new HashMap<Long, Flight>();
   

public void addDetails() {
	Flight f1=new Flight(1234,"airline","ghjk",89);
	Flight f2=new Flight(7845,"airline","bhtd",96);
	Flight.put(f1.getFlightNumber(),f1);
	Flight.put(f2.getFlightNumber(),f2);
	
Schedule s1=new Schedule("Hyd","Bang",LocalDateTime.of(2020,3,2,8,45,23),LocalDateTime.of(2020,3,3,2,34,53));
Schedule s2=new Schedule("Delhi","pune",LocalDateTime.of(2020,3,3,6,45,23),LocalDateTime.of(2020,3,3,8,45,23));
Schedule s3=new Schedule("Chennai","Hyd",LocalDateTime.of(2020,2,4,11,45,23),LocalDateTime.of(2020,2,4,2,25,23));
schedule.put(s1.getSourceAirport(),s1);
schedule.put(s2.getSourceAirport(),s2);
schedule.put(s3.getSourceAirport(),s3);
}
 public boolean modifyScheduledFlightByFlightNumber
     (String sourceAirport,String destinationAirport,LocalDateTime arrivalTime,LocalDateTime departureTime,long flightNumber)throws FlightException {
	
		if(!Flight.containsKey(flightNumber)) {
			throw new FlightException("Flight not found");
		}
		else {
			scheduleList.get(ScheduledFlightDao.get(flightNumber)).getSchedule().setArrivalTime(arrivalTime);
			scheduleList.get(ScheduledFlightDao.get(flightNumber)).getSchedule().setDepartureTime(departureTime);
			scheduleList.get(ScheduledFlightDao.get(flightNumber)).getSchedule().setSourceAirport(sourceAirport);
			scheduleList.get(ScheduledFlightDao.get(flightNumber)).getSchedule().setDestinationAirport(destinationAirport);
			}
	  return false;
    }

	public boolean deleteScheduledFlight(long flightNumber) throws FlightException {
		
		if(ScheduledFlightDao.containsKey(flightNumber)) {
		  	ScheduledFlightDao.remove(flightNumber);  
		  	return true;
		}
		
		else throw new FlightException("Flight not available");		
		
      	}
}
