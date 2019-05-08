package com.capgemini.currentexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.currentexchange.entity.ExchangeValue;
import com.capgemini.currentexchange.service.ExchangeValueService;

@RestController
public class ForexController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueService service;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue value = service.findByFromAndTo(from, to);
		
		value.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return value;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

