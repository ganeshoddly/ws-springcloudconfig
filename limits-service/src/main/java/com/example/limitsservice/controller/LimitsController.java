package com.example.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservice.configuration.MyConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	MyConfiguration myConfig;
	
	@GetMapping("/limitsConfig")
	public LimitsDemo getLimitsConfig()
	{
		return new LimitsDemo(myConfig.getMinimum(), myConfig.getMinimum());
	}

}
