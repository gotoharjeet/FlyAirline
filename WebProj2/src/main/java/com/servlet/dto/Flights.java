package com.servlet.dto;

public class Flights {

	private String flightNumber;
	private Place_Airport departure;
	private Place_Airport arrival;
	private int durationInMinutes;
	
	public Flights()
	{
		
	}

	public Flights(String flightNumber, Place_Airport departure, Place_Airport arrival, int durationInMinutes) {
		super();
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.durationInMinutes = durationInMinutes;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Place_Airport getDeparture() {
		return departure;
	}

	public void setDeparture(Place_Airport departure) {
		this.departure = departure;
	}

	public Place_Airport getArrival() {
		return arrival;
	}

	public void setArrival(Place_Airport arrival) {
		this.arrival = arrival;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	
}
