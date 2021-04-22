package com.cda.exception;

public class PlatformException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public PlatformException(String message, Exception exception) {
		super(message, exception);

	}

	public PlatformException(String message) {
		super(message);

	}


	
	
	

}
