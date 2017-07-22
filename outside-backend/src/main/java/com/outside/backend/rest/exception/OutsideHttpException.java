/**
 * 
 */
package com.outside.backend.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dtyai
 *
 */
@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal Server Error")
public class OutsideHttpException extends Exception {

	private static final long serialVersionUID = -3047747607962666045L;

	public OutsideHttpException(String message) {
		super(message);
	}
	
	public OutsideHttpException(String message, Exception e) {
		super(message, e);
	}
	
}
