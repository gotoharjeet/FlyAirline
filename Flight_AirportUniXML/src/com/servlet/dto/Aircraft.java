package com.servlet.dto;

import java.util.List;

public class Aircraft {
	private int aircraftId;
	private String aircraftName;
	private String aircraftModel;
	private int manufactYear;
	private FlightInstance flightInstance;
	private List<Seat> seats;
	
	
	public Aircraft() {}
	
	
	
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getAircraftName() {
		return aircraftName;
	}
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}
	public String getAircraftModel() {
		return aircraftModel;
	}
	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}
	public int getManufactYear() {
		return manufactYear;
	}
	public void setManufactYear(int manufactYear) {
		this.manufactYear = manufactYear;
	}



	public FlightInstance getFlightInstance() {
		return flightInstance;
	}



	public void setFlightInstance(FlightInstance flightInstance) {
		this.flightInstance = flightInstance;
	}



	public List<Seat> getSeats() {
		return seats;
	}



	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	

	
}
