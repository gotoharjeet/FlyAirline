package com.servlet.dto;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.IntegerType;
import org.hibernate.usertype.*;

import com.servlet.dto.Passenger;

public class PassengerType implements UserType {
	
	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		
		return cached;
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		
		final Passenger receivedParam=(Passenger)value;
		final Passenger passenger=new Passenger(receivedParam);
		return passenger;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		
		return (Serializable) value;
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
			statement.setNull(index + 1, Types.VARCHAR);
			statement.setNull(index + 2, Types.VARCHAR);
            statement.setNull(index + 3, Types.VARCHAR);
		}
		else
		{
			Passenger passenger=(Passenger)value;
			//System.out.println(passenger.getPassengerId());
			statement.setInt(index, passenger.getPassengerId());
			if(null != passenger.getPassengerName())
			{
				String createdVarChar = new String(passenger.getPassengerName());
				statement.setString(index +1, createdVarChar);
            } else {
            	statement.setNull(index + 1, Types.VARCHAR);
            }
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
			}
		}
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		
		return this.deepCopy(original);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Class returnedClass() {
		return Passenger.class;
	} 

	@Override
	public int[] sqlTypes() {
		//passengerId, passengerName,passengerPassport,dob
        
		return new int[] {
				Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR
		};
	}

}
