package com.servlet.dto;

public class Place_Airport {
	private String airportCode;
	private String airportName;
	private String airportAdd;
	
	public Place_Airport() {}
	//not using hibernate; for hibernate instance member airportCode value will not be assigned thru Constructor
	
	public Place_Airport(String airportCode,String airportName,String airportAdd)
	{
		this.airportCode=airportCode;
		this.airportName=airportName;
		this.airportAdd=airportAdd;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportAdd() {
		return airportAdd;
	}

	public void setAirportAdd(String airportAdd) {
		this.airportAdd = airportAdd;
	}

	@Override
	public String toString() {
		return "Place_Airport [airportCode=" + airportCode + ", airportName=" + airportName + ", airportAdd="
				+ airportAdd + "]";
	}

	
	
}
