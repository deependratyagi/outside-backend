/**
 * 
 */
package com.outside.backend.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.outside.backend.application.OutsideMainApplication;
import com.outside.backend.user.UserIn;

/**
 * @author dtyai
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=OutsideMainApplication.class)
@AutoConfigureMockMvc
public class UserRegistrationIntegrationTest {
	@Autowired
    private MockMvc mvc;

    @Test
    public void testCreateNewUserSuccessfully() throws Exception {
    	
    	    UserIn userIn = new UserIn();
    	    userIn.setFirstName("test-user");
    	    userIn.setPhoneNumber("0123456789");
        //mvc.perform(MockMvcRequestBuilders.post("/users").accept(MediaType.APPLICATION_JSON).content(userIn.toString()))
          //      .andExpect(status().isOk())
            //    .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }
	
}
