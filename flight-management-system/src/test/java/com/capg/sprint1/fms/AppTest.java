package com.capg.sprint1.fms;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import  org.junit.*;
import com.capg.sprint1.fms.dao.FlightException;
import com.capg.sprint1.fms.dao.ScheduledFlightDao;
import com.capg.sprint1.fms.dao.ScheduledFlightDaoImpl;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.service.ScheduledFlightServices;
import com.capg.sprint1.fms.service.ScheduledFlightServicesImpl;

public class AppTest {
	
	ScheduledFlightServices obj=new ScheduledFlightServicesImpl();
	ScheduledFlightDao obj1=new ScheduledFlightDaoImpl();
	static Map<Long, Flight> ScheduledFlightDao=ScheduledFlightDaoImpl.ScheduledFlightDao;
	static Map<Long, Flight> Flight=new HashMap<Long, Flight>();
	static Flight a;
	
	@BeforeAll
	public static void addDetails() {
		 a=new Flight(1234,"airline","ghjk",89);
		 Flight.put(a.getFlightNumber(),a);
	}
	@Test
	public void test() throws FlightException {
		addDetails();
		assertEquals(true,obj.deleteScheduledFlight(1234L));
		}
	
    @Test
    public void testcase() throws FlightException {
    	addDetails();
    	assertEquals(true,obj1.modifyScheduledFlightByFlightNumber("Hyd","Bang",LocalDateTime.of(2020,3,2,8,45,23),LocalDateTime.of(2020,3,3,2,34,53),1234));
    }
}
