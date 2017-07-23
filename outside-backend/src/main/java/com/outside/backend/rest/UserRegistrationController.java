/**
 * 
 */
package com.outside.backend.rest;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.outside.backend.rest.exception.OutsideBadRequestException;
import com.outside.backend.rest.exception.OutsideHttpException;
import com.outside.backend.service.UserRegistrationService;
import com.outside.backend.service.exception.OutsideServiceException;
import com.outside.backend.service.exception.UserValidationException;
import com.outside.backend.user.UserIn;

/**
 * @author dtyai
 *
 */
@RestController
public class UserRegistrationController {

	private Logger LOGGER = Logger.getLogger(UserRegistrationController.class);
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@RequestMapping(value = { "/users" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public UserIn createNewUser(@RequestBody UserIn user) throws OutsideHttpException {
		return internalCreateNewUser(user);

	}

	private UserIn internalCreateNewUser(UserIn user) throws OutsideHttpException {
		try {
			UserIn createdUser = userRegistrationService.saveNewUser(user);
			if(user != null) {
				return createdUser;
			}
		} 
		catch(UserValidationException e) {
			LOGGER.error("Error while validating new user: " + e.getMessage());
			throw new OutsideBadRequestException(e.getMessage(), e);
		}
		catch (OutsideServiceException e) {
			LOGGER.error("Error while creating new user: " + e.getMessage());
			throw new OutsideHttpException(e.getMessage(), e);
		}
		return null;
		
	}
	
}
