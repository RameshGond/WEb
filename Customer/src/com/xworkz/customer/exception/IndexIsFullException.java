package com.xworkz.customer.exception;

public class IndexIsFullException extends RuntimeException {
	public IndexIsFullException() {
		
	}
	public IndexIsFullException(String msge) {
		super (msge);
	}

}
