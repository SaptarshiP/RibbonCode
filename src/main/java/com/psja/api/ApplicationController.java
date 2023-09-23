package com.psja.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApplicationController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/ribbonGetData")
	public String ribbonGetData() {
		String data = restTemplate.getForEntity("http://TEST-SERVICE/getData", String.class).getBody();
		return data;
	}
	
}
