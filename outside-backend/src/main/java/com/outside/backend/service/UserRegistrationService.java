/**
 * 
 */
package com.outside.backend.service;

import org.springframework.stereotype.Component;

import com.outside.backend.service.exception.OutsideServiceException;
import com.outside.backend.service.exception.UserValidationException;
import com.outside.backend.user.UserIn;

/**
 * @author dtyai
 *
 */
@Component
public class UserRegistrationService {

	public void saveNewUser(UserIn user) throws OutsideServiceException {
		// validate userIn
		
		validateUser(user); 
	}
	
	private void validateUser(UserIn user) throws UserValidationException {
		String firstName = user.getFirstName();
		String phoneNumber = user.getPhoneNumber();
		
		if(firstName == null || phoneNumber == null) {
			throw new UserValidationException("First name or phone number is not provided.");
		}
		
		if(firstName.trim().equals("") || phoneNumber.trim().equals("")) {
			throw new UserValidationException("First name or phone number is empty.");
		}
		
	}
}
