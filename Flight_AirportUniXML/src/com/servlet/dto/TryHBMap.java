package com.servlet.dto;

import java.util.Map;

public class TryHBMap {
	private int mapId;
	private Map<Passenger,FlightSeat> seatMap;
	
	public TryHBMap() {}

	
	
	public int getMapId() {
		return mapId;
	}



	public void setMapId(int mapId) {
		this.mapId = mapId;
	}



	public Map<Passenger, FlightSeat> getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(Map<Passenger, FlightSeat> seatMap) {
		this.seatMap = seatMap;
	}
	
	
}
