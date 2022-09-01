package com.servlet.Client;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.servlet.dto.Aircraft;
import com.servlet.dto.Arr_Airport;
import com.servlet.dto.Dep_Airport;
import com.servlet.dto.Flight;
import com.servlet.dto.FlightInstance;
/*import com.servlet.dto.Aircraft;
import com.servlet.dto.Arr_Airport;
import com.servlet.dto.Dep_Airport;
import com.servlet.dto.Flight;
import com.servlet.dto.FlightInstance;
*/
import com.servlet.dto.FlightSeat;
import com.servlet.dto.FlightStatus;
import com.servlet.dto.Passenger;
import com.servlet.dto.Seat;
//import com.servlet.dto.Seat;
import com.servlet.dto.SeatClass;
import com.servlet.dto.SeatType;

public class Client {
	static FlightStatus flightStatus;
	static SeatClass seatClass;
	static SeatType sType;
	
	
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		
		
		  Dep_Airport dep_airport = new Dep_Airport();
		  dep_airport.setName("Shri Guru Gobind Singh Ji Airport");
		  dep_airport.setAddress("Nanded");
		  
		  
		  Arr_Airport arr_airport=new Arr_Airport();
		  arr_airport.setName("Indira Gandhi Airport");
		  arr_airport.setAddress("Palam");
		  
		  
		/*  Seat seat =new Seat(); 
		  seat.setSeatClass(seatClass.ECONOMY);
		  seat.setSeatType(sType.REGULAR);*/
		  
		 /* List<Seat> seats=new ArrayList<Seat>(); 
		  seats.add(seat);*/
		  
		 /* Aircraft aircraft= new Aircraft();
		  aircraft.setAircraftName("Air India Boeing 787 Dreamliner ");
		  aircraft.setAircraftModel("GE Genx - 1B67"); aircraft.setManufactYear(2005);
		  aircraft.setSeats(seats);*/
		  
		  
		 /* FlightInstance fInstance=new FlightInstance();
		  fInstance.setDepartureTime("1100"); 
		  fInstance.setGate("T3");
		  fInstance.setFstatus(flightStatus.ACTIVE); 
		  fInstance.setAircraft(aircraft);
		  
		  List<FlightInstance> flightInstances=new ArrayList<FlightInstance>();
		  flightInstances.add(fInstance); 
		  
		  Flight flight = new Flight();
		  flight.setDeparture(dep_airport); 
		  flight.setArrival(arr_airport);
		  flight.setDurationInMinutes(150); 
		  flight.setFlightInstance(flightInstances);
		  
		  
		  session.save(fInstance); 
		  session.save(dep_airport);
		  session.save(arr_airport); 
		  session.save(flight); 
		  
		  
		  //session.save(arr_airport);
		 
		
		/*
		 * Passenger passenger1=new Passenger(); passenger1.setPassengerId(101);
		 * passenger1.setPassengerName("DurgaJi");
		 * passenger1.setPassportNumber("Durgaji1012014");
		 * 
		 * FlightSeat fseat=new FlightSeat(); fseat.setSeatNumber(201);
		 * fseat.setSeatClass(seatClass.BUSINESS);
		 * fseat.setSeatType(SeatType.ACCESSIBLE);
		 * 
		 * HashMap<Passenger,FlightSeat> mapPassFlight=new
		 * HashMap<Passenger,FlightSeat>(); mapPassFlight.put(passenger1, fseat);
		 * 
		 * //session.save(mapPassFlight); session.save(passenger1); session.save(fseat);
		 */
		
		txn.commit();
		factory.close();
		session.close();
	}

}
