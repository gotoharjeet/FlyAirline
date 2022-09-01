package com.servlet.dto;

import java.util.Map;

public class FlightReservation {
	private int reservationNumber;
	private FlightInstance flight;
	private Map<Passenger,FlightSeat> seatMap;
	private ReservationStatus status;

	public FlightReservation() {}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public FlightInstance getFlight() {
		return flight;
	}

	public void setFlight(FlightInstance flight) {
		this.flight = flight;
	}

	public Map<Passenger, FlightSeat> getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(Map<Passenger, FlightSeat> seatMap) {
		this.seatMap = seatMap;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	
	
	
}
