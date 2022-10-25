package com.attra.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attra.microservices.limitsservices.bean.Limits;
import com.attra.microservices.limitsservices.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		//return new Limits(1, 10000);
	}

}