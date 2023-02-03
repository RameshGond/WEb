package com.xworkz.customer.exception;

public class InvalidDataException extends RuntimeException{
	public InvalidDataException() {
		
	}
	public InvalidDataException(String msge) {
		super (msge);
	}

}
