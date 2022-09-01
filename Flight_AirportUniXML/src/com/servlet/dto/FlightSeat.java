package com.servlet.dto;

public class FlightSeat extends Seat {
	private int flightSeatId;
	private float fare;
	private int reservationNumber;

	public FlightSeat(){}

	
	public FlightSeat(FlightSeat other)
	{
		this.setFlightSeatId(other.getFlightSeatId());
		this.setReservationNumber(other.getReservationNumber());
		this.setSeatNumber(other.getSeatNumber());
		this.setSeatClass(other.getSeatClass());
		this.setSeatType(other.getSeatType());
		this.setFare(other.getFare());
	}
	
	public float getFare() {
		return fare;
	}
	
	public int getFlightSeatId() {
		return flightSeatId;
	}

	public void setFlightSeatId(int flightSeatId) {
		this.flightSeatId = flightSeatId;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	
	
}
