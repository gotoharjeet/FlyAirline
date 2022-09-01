package com.servlet.service;

import com.servlet.dao.PlaceDao;
import com.servlet.dao.PlaceDaoImpl;
import com.servlet.dao.UserDao;
import com.servlet.dto.Place_Airport;

public class PlaceServiceImpl implements PlaceService
{
	private PlaceDao dao;
	
	
	public PlaceServiceImpl()
	{
		dao=new PlaceDaoImpl();
	}
	
	
	@Override
	public int addPlace(Place_Airport place_airport) {
		System.out.println("Code :"+place_airport.getAirportCode());
		return dao.addPlace(place_airport);
	}

}
