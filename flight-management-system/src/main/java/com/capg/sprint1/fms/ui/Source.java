package com.capg.sprint1.fms.ui;

import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

import com.capg.sprint1.fms.dao.FlightDao;
import com.capg.sprint1.fms.dao.FlightDaoImpl;
import com.capg.sprint1.fms.dao.FlightException;
import com.capg.sprint1.fms.model.Airport;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.Schedule;
import com.capg.sprint1.fms.service.FlightServiceImpl;
import com.capg.sprint1.fms.service.ScheduledFlightServicesImpl;

public class Source {

	private static String sourceAirport;
	private static LocalDateTime departureTime;
	private static String destinationAirport;
	private static LocalDateTime arrivalTime;

	public static void main(String[] args) throws FlightException  {
		
	FlightServiceImpl flgsrobj=new FlightServiceImpl();
	FlightDaoImpl fobj=new FlightDaoImpl();
	ScheduledFlightServicesImpl sdflgsrobj=new ScheduledFlightServicesImpl();
	
	Scanner in=new Scanner(System.in);

	System.out.println("Choose Modifications:\n 1.cancel\n 2.modify\n");
	int choice=in.nextInt();
	System.out.println("Enter Flight Number");
	 int flightNumber=in.nextInt();
	switch(choice) {
	case 1:
//		System.out.println("Enter Flight Number");
//		 int flightNumber=in.nextInt();
		 try {
			 flgsrobj.cancelByFlightNumber(flightNumber);
			 System.out.println("Flight found and cancelled");
			 }
		 catch(FlightException ex) {
			 System.out.println("Error occured : "+ex.getMessage());
			 }
		 break;
	case 2:
//		sdflgsrobj.modifyScheduledFlightByFlightNumber(sourceAirport,destinationAirport,arrivalTime,departureTime,flightNumber);
		 System.out.println("Enter source");
	    String sourceAirport=in.next()+in.nextLine();
		System.out.println("Enter destination");
		String destinationAirport=in.next()+in.nextLine();
		 LocalDateTime arrivalTime=LocalDateTime.of(2020, 5, 3, 6, 25);
	    LocalDateTime departureTime=LocalDateTime.of(2020,5,3, 8, 55);
		sdflgsrobj.modifyScheduledFlightByFlightNumber(sourceAirport,destinationAirport,arrivalTime,departureTime,flightNumber);
		System.out.println("Modifications done successfully");
		System.out.println(sourceAirport+"\n"+destinationAirport+"\n"+arrivalTime+"\n"+departureTime);
		break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
	}
