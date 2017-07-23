/**
 * 
 */
package com.outside.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.outside.backend.user.UserIn;

/**
 * @author dtyai
 *
 */
@Repository
public class UserRegistrationRepoImpl implements UserRegistrationRepo {
	
	@Autowired
	@PersistenceContext
	private EntityManager em;

	@Override
	public UserIn addUser(UserIn user) {
		if(user != null) {
			em.persist(user);
			return user;
		}
		return null;
	}
	
	
	
}
