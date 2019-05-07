package com.kce.service;

import com.kce.model.eventBean;
import com.kce.model.registerBean;

public interface eventService {
	
	eventBean userSignup(eventBean signup);
	
	int userLogin(String name,String passw);
	
	registerBean eventReg(registerBean availevent);
	

}
