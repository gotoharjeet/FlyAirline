package com.servlet.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import com.servlet.dto.Place_Airport;
import com.servlet.util.SessionFactoryManagerImpl;

public class SearchPlaceDaoImpl implements SearchPlaceDao {
	private SessionFactory factory;
	
	public SearchPlaceDaoImpl()
	{
		factory=new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	@Override
	public Place_Airport searchPlace(String airportCode) {
		Session session=factory.openSession();
		
		Place_Airport place_airport=session.get(Place_Airport.class, airportCode);
		
		return place_airport;
	}

}
