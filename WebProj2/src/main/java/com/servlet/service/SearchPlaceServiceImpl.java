package com.servlet.service;

import com.servlet.dao.SearchPlaceDao;
import com.servlet.dao.SearchPlaceDaoImpl;
import com.servlet.dto.Place_Airport;

public class SearchPlaceServiceImpl implements SearchPlaceService {
	private SearchPlaceDao dao;

	public SearchPlaceServiceImpl()
	{
		dao = new SearchPlaceDaoImpl();
	}
	
	
	@Override
	public Place_Airport searchPlace(String airportCode) {
		
		return dao.searchPlace(airportCode);
	}
	

}
