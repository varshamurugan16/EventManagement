package com.kce.dao;

import com.kce.model.eventBean;
import com.kce.model.registerBean;

public interface eventdao {
	
 eventBean userSignup(eventBean signup);
 
 int userLogin(String name,String passw);
 
 registerBean eventReg(registerBean availevent);


}
