package com.servlet.dto;

import java.util.Date;

import org.joda.time.DateTime;


public class FlightInstance {
	private int finstanceId;
	private String departureTime;
	private String gate;
	private FlightStatus fstatus;
	private Aircraft aircraft;
	
	public FlightInstance() {}
	
	
	
	public int getFinstanceId() {
		return finstanceId;
	}

	public void setFinstanceId(int finstanceId) {
		this.finstanceId = finstanceId;
	}



	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	
	  public FlightStatus getFstatus() { return fstatus; } 
	  
	  public void setFstatus(FlightStatus fstatus) { this.fstatus = fstatus; }



	public Aircraft getAircraft() {
		return aircraft;
	}



	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	 
	
	
	
	

}
