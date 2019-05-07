package com.kce.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kce.model.eventBean;
import com.kce.model.registerBean;
import com.kce.service.eventService;


@Controller	
public class Eventcontroller<String, HttpSession, eventService, HttpServletRequest > {
	@Autowired
	HttpServletRequest request;

	@Autowired
	eventService eveService;
	
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("login") eventBean login) {
		String name = login.getName();
		String passw = login.getPass();
		
		
				if (eveService.userLogin(name, passw) == 1) {
					return ("availableEvents");
				} else {
					return ("login");
		}
	}
	

	@RequestMapping(value = "/userSignup", method = RequestMethod.POST)
	public String userSignup(@ModelAttribute("signup") eventBean signup) {

			if (eveService.userLogin(signup) != null) {
				return "login";
		}

		return "signup";
	}
	
	@RequestMapping("/eventReg")
	public String eventReg() {
		return "register";
	}
	
	
	@RequestMapping(value = "/eventReg", method = RequestMethod.POST)
	public String eventReg(@ModelAttribute("availevent") registerBean availevent) {

		if (eveService.eventReg(availevent) != null) {
			return "success";
	}
	
	
	


}
