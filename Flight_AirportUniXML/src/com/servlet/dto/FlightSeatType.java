package com.servlet.dto;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

public class FlightSeatType implements UserType {

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return cached;
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		
		final FlightSeat receivedParam=(FlightSeat)value;
		final FlightSeat flightSeat=new FlightSeat(receivedParam);
		return flightSeat;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable)value;
	}

	@Override
	public boolean equals(Object o1, Object o2) throws HibernateException {
		boolean isEqual=false;
		if(o1 == o2)
		{
			isEqual=true;
		}
		if(null == o1 || null == o2)
		{
			isEqual=false;
		}
		else 
		{
			isEqual=o1.equals(o2);
		}
		return isEqual;
	
	}

	@Override
	public int hashCode(Object value) throws HibernateException {
		return value.hashCode();
	}

	@Override
	public boolean isMutable() {
		return true;
	}

	@Override
	public Object nullSafeGet(ResultSet arg0, String[] arg1, SharedSessionContractImplementor arg2, Object arg3)
			throws HibernateException, SQLException {
		return null;
	}

	@Override
	public void nullSafeSet(PreparedStatement statement, Object value, int index, SharedSessionContractImplementor arg3)
			throws HibernateException, SQLException {
		if(null == value)
		{
			statement.setNull(index, Types.INTEGER);
			statement.setNull(index + 1, Types.INTEGER);
			statement.setNull(index + 2, Types.FLOAT);
            statement.setNull(index + 3, Types.INTEGER);
            statement.setNull(index + 4, Types.VARCHAR);
            statement.setNull(index + 5, Types.VARCHAR);
		}
		else
		{
			FlightSeat flightSeat=(FlightSeat)value;
			//System.out.println(passenger.getPassengerId());
			statement.setInt(index, flightSeat.getFlightSeatId());
			statement.setInt(index+1, flightSeat.getReservationNumber());
			statement.setFloat(index+2, flightSeat.getFare());
			statement.setInt(index+3, flightSeat.getSeatNumber());
			statement.setString(index+4, flightSeat.getSeatClass().toString());
			statement.setString(index+5, flightSeat.getSeatType().toString());
			
			/*
			 * if(null != flightSeat.get) { String createdVarChar = new
			 * String(passenger.getPassengerName()); statement.setString(index +1,
			 * createdVarChar); } else { statement.setNull(index + 1, Types.VARCHAR); }
			 
			if(null != passenger.getPassportNumber())
			{
				String createdVarChar = new String(passenger.getPassportNumber());
				statement.setString(index +2, createdVarChar);
			}
			else
			{
				statement.setNull(index + 2, Types.VARCHAR);
			}
			if(null != passenger.getDob())
			{
				String createdVarChar = new String(passenger.getDob());
				statement.setString(index +3, createdVarChar);
			}
			else
			{
				statement.setNull(index + 3, Types.VARCHAR);
			}*/
			
			
		}
		
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return this.deepCopy(original);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class returnedClass() {
		return FlightSeat.class;
	}

	@Override
	public int[] sqlTypes() {
		
		return new int[] {
				Types.INTEGER,Types.INTEGER,Types.FLOAT,Types.INTEGER,Types.VARCHAR,Types.VARCHAR				
		};
	}

}
