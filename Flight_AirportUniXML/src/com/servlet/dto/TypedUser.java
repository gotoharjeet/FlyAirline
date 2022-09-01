package com.servlet.dto;

import java.util.Map;

public class TypedUser {
	

	private int reservationNumber;
	
	private Passenger passenger;
	
	public int getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	
	
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	/*
	 * public ReservationStatus getStatus() { return status; } public void
	 * setStatus(ReservationStatus status) { this.status = status; }
	 */
	
	
}
