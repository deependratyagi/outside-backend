/**
 * 
 */
package com.outside.backend.service.exception;

/**
 * @author dtyai
 *
 */
public class UserValidationException extends OutsideServiceException {
	
	private static final long serialVersionUID = 8241354552460525664L;

	public UserValidationException(String message) {
		super(message);
	}
	
	public UserValidationException(String message, Exception e) {
		super(message, e);
	}
	
}
