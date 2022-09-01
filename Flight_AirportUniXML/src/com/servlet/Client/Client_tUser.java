package com.servlet.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.servlet.dto.Passenger;
import com.servlet.dto.ReservationStatus;
import com.servlet.dto.TypedUser;

public class Client_tUser {
	
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		
		Passenger passenger=new Passenger();
		passenger.setPassengerId(1);
		passenger.setPassengerName("DurgaJi");
		passenger.setPassportNumber("DurgaJi101");
		passenger.setDob("1967");
		
		Passenger passenger1=new Passenger();
		passenger1.setPassengerId(2);
		passenger1.setPassengerName("NagoorJI");
		passenger1.setPassportNumber("NagoorJi102");
		passenger1.setDob("1967");
		
		Passenger passenger2=new Passenger();
		passenger2.setPassengerId(3);
		passenger2.setPassengerName("NaveenJI");
		passenger2.setPassportNumber("NaveenJi103");
		passenger2.setDob("1969");
		
		
		
		
		TypedUser tuser=new TypedUser();
		tuser.setPassenger(passenger);
		
		TypedUser tuser1=new TypedUser();
		tuser1.setPassenger(passenger1);
		
		
		TypedUser tuser2=new TypedUser();
		tuser2.setPassenger(passenger);
		//tuser.setStatus(ReservationStatus.Confirmed);
		session.save(tuser);
		session.save(tuser1);
		session.save(tuser2);
		txn.commit();
		factory.close();
		session.close();

	}

}
