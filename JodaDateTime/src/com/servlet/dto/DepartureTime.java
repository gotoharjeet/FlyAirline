package com.servlet.dto;

import java.time.LocalDate;
import java.time.*;
import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;

public class DepartureTime {

	public static void main(String[] args) {
		
		
		
		String arrivalTime = "1720";
	    String departingTime = "1100";
	    String arrivalDate = "20200220";
	    String departingDate = "20200211";
	   // String arrivalTimeZone = "Africa/Niamey";
	    String arrivalTimeZone = "America/Mendoza";
	    //String departingTimeZone = "America/Mendoza";
	    String departingTimeZone = "Asia/Kolkata";
	   // DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss a");
	    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmm");
	   
	    ZonedDateTime departure=LocalDate.parse(departingDate, DateTimeFormatter.BASIC_ISO_DATE)
	    			.atTime(LocalTime.parse(departingTime,timeFormatter)
	    			).atZone(ZoneId.of(departingTimeZone));
	    System.out.println(departure);
	    
	    ZonedDateTime arrival = LocalDate.parse(arrivalDate,DateTimeFormatter.BASIC_ISO_DATE)
	    						.atTime(LocalTime.parse(arrivalTime,timeFormatter))
	    						.atZone(ZoneId.of(arrivalTimeZone));
	    System.out.println(arrival);
	    Duration difference = Duration.between(departure, arrival);
	    
	    System.out.println(difference);
	    
	}

}


/*
 * DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmm");
 * 
 * String arrivalTime = "1720"; String departingTime = "1100"; String
 * arrivalDate = "20200220"; String departingDate = "20200211"; String
 * arrivalTimeZone = "Africa/Niamey"; String departingTimeZone =
 * "America/Mendoza";
 * 
 * ZonedDateTime departure = LocalDate.parse(departingDate,
 * DateTimeFormatter.BASIC_ISO_DATE) .atTime(LocalTime.parse(departingTime,
 * timeFormatter)) .atZone(ZoneId.of(departingTimeZone)); 
 * 
 * ZonedDateTime arrival
 * = LocalDate.parse(arrivalDate, DateTimeFormatter.BASIC_ISO_DATE)
 * .atTime(LocalTime.parse(arrivalTime, timeFormatter))
 * .atZone(ZoneId.of(arrivalTimeZone));
 * 
 * Duration difference = Duration.between(departure, arrival);
 * System.out.println(difference);
 */
