package com.outside.backend.service.exception;

public class OutsideServiceException extends Exception {

	private static final long serialVersionUID = 6546374422083110654L;

	public OutsideServiceException(String message) {
		super(message);
	}
	
	public OutsideServiceException(String message, Exception e) {
		super(message, e);
	}
	
}
