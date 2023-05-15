package com.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		logger.debug("getWelcomeMsg() execution started");
		
		String msg="Welcome to Page...";
		
		logger.debug("getWelcomeMsg() execution ended");
		
		return msg;
		
	}
	

}
