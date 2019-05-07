package com.kce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.kce.model.eventBean;


@Service("eveService")
public class eventserviceImpl implements eventService {
	
	@Autowired
	private eventdao evedao;
	
	@Override
	@Transactional
	public eventBean userSignup(eventBean signup)
	{
		eventBean a=(eventBean)evedao.userSignup(signup);
		return a;
	}
	

	@Override
	@Transactional
	public int userLogin(String name, String passw) {
		return evedao.userLogin(name, passw);
	}
	
	@Override
	@Transactional
	public registerBean eventReg(registerBean availevent)
	{
		registerBean a=(registerBean)evedao.eventReg(availevent);
		return a;
	}


}
