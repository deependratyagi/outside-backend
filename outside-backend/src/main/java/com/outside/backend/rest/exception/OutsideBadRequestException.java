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
@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Bad Request Error")
public class OutsideBadRequestException extends OutsideHttpException {
	
	private static final long serialVersionUID = -1902115574937257866L;

	public OutsideBadRequestException(String message) {
		super(message);
	}
	
	public OutsideBadRequestException(String message, Exception e) {
		super(message, e);
	}
}
