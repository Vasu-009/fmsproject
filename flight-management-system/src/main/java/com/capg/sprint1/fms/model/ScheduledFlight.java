package com.capg.sprint1.fms.model;

public class ScheduledFlight {
	
	Flight flight;
	int availableSeats;
	Schedule schedule;
	public ScheduledFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledFlight(Flight flight, int availableSeats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableSeats;
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledFlight other = (ScheduledFlight) obj;
		if (availableSeats != other.availableSeats)
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ScheduledFlight [flight=" + flight + ", availableSeats=" + availableSeats + ", schedule=" + schedule
				+ "]";
	}

	

}
