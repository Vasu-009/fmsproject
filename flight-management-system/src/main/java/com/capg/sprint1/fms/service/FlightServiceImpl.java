
package com.capg.sprint1.fms.service;

import java.math.BigInteger;
import com.capg.sprint1.fms.dao.FlightDao;
import com.capg.sprint1.fms.dao.FlightDaoImpl;
import com.capg.sprint1.fms.dao.FlightException;
import com.capg.sprint1.fms.model.Flight;

public class FlightServiceImpl implements FlightService {
	
	FlightDao flightDao=new FlightDaoImpl();

	public Flight modifyByFlightNumber(long flightNumber) throws FlightException {
		return flightDao.modifyByFlightNumber(flightNumber);
		}

	public boolean cancelByFlightNumber(long flightNumber) throws FlightException {
		return flightDao.cancelByFlightNumber(flightNumber);
		}
}

