package com.capg.sprint1.fms.model;


public class Passenger {

	long pnrNumber,passengerUIN;
	String passengerName;
	int passengerAge;
	double Luggage;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(long pnrNumber, long passengerUIN, String passengerName, int passengerAge, double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerUIN = passengerUIN;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		Luggage = luggage;
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public double getLuggage() {
		return Luggage;
	}
	public void setLuggage(double luggage) {
		Luggage = luggage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Luggage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + passengerAge;
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + (int) (passengerUIN ^ (passengerUIN >>> 32));
		result = prime * result + (int) (pnrNumber ^ (pnrNumber >>> 32));
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
		Passenger other = (Passenger) obj;
		if (Double.doubleToLongBits(Luggage) != Double.doubleToLongBits(other.Luggage))
			return false;
		if (passengerAge != other.passengerAge)
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (passengerUIN != other.passengerUIN)
			return false;
		if (pnrNumber != other.pnrNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Passenger [pnrNumber=" + pnrNumber + ", passengerUIN=" + passengerUIN + ", passengerName="
				+ passengerName + ", passengerAge=" + passengerAge + ", Luggage=" + Luggage + "]";
	}
	


}
