package com.servlet.dto;

import java.io.Serializable;

public class Passenger implements Serializable{
	private int passengerId;
	private String passengerName;
	private String passportNumber;
	private String dob;
	
	public Passenger() {}

	public Passenger(Passenger other)
	{
		
		this.setPassengerId(other.getPassengerId());
		this.setPassengerName(other.getPassengerName());
		this.setPassportNumber(other.getPassportNumber());
		this.setDob(other.getDob());
	}
	
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual=false;
		if(obj instanceof Passenger)
		{
			Passenger passenger=(Passenger)obj;
			isEqual=passenger.getPassengerName().equals(this.getPassengerName());
					passenger.getPassportNumber().equals(this.getPassportNumber());
					passenger.getDob().equals(this.getDob());
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		int hash=this.getPassengerName().hashCode();
		hash=hash*17+this.getPassportNumber().hashCode();
		hash=hash*31+this.getDob().hashCode();
		return hash;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passportNumber="
				+ passportNumber + ", dob=" + dob + "]";
	}

	

	
}
