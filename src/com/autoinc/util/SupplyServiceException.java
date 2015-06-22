package com.autoinc.util;

public class SupplyServiceException extends Exception{
	
	public SupplyServiceException() {
	}
	
	public SupplyServiceException(String message)
	{
		super(message);
	}

	public SupplyServiceException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
