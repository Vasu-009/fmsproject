package com.capg.sprint1.fms.model;

import java.math.BigInteger;

public class Flight {
	
	private long flightNumber;
	private String flightMode;
	private String carrierName;
	private int seatCapacity;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flight(long flightNumber, String flightMode, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightMode = flightMode;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightMode() {
		return flightMode;
	}

	public void setFlightMode(String flightMode) {
		this.flightMode = flightMode;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
		result = prime * result + ((flightMode == null) ? 0 : flightMode.hashCode());
		result = prime * result + (int) (flightNumber ^ (flightNumber >>> 32));
		result = prime * result + seatCapacity;
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
		Flight other = (Flight) obj;
		if (carrierName == null) {
			if (other.carrierName != null)
				return false;
		} else if (!carrierName.equals(other.carrierName))
			return false;
		if (flightMode == null) {
			if (other.flightMode != null)
				return false;
		} else if (!flightMode.equals(other.flightMode))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightMode=" + flightMode + ", carrierName=" + carrierName
				+ ", seatCapacity=" + seatCapacity + "]";
	}

}
