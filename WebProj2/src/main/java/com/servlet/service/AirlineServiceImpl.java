package com.servlet.service;

import com.servlet.dao.AirlineDao;
import com.servlet.dao.AirlineDaoImpl;
import com.servlet.dto.Airline;

public class AirlineServiceImpl implements AirlineService 
{
	private AirlineDao dao;

	public AirlineServiceImpl()
	{
		dao=new AirlineDaoImpl();
	}
	
	@Override
	public int addAirline(Airline airline) {
		
		System.out.println("Code :"+airline.getAirlineCode());
		return dao.addAirline(airline);
	}

}
