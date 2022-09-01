package com.servlet.dto;

import java.util.List;

import java.util.Set;

public class Flight {
	private int flightNumber;
	private Dep_Airport departure;
	private Arr_Airport arrival;
	private int durationInMinutes;
	private List<FlightInstance> flightInstance;
	
	
	

	public Flight() {}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public Dep_Airport getDeparture() {
		return departure;
	}


	public void setDeparture(Dep_Airport departure) {
		this.departure = departure;
	}


	
	
	  public Arr_Airport getArrival() { return arrival; }
	  
	  
	  public void setArrival(Arr_Airport arrival) { this.arrival = arrival; }
	  
	  
	 	public int getDurationInMinutes() {
		return durationInMinutes;
	}


	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	
	public List<FlightInstance> getFlightInstance() {
		return flightInstance;
	}


	public void setFlightInstance(List<FlightInstance> flightInstance) {
		this.flightInstance = flightInstance;
	}

}
