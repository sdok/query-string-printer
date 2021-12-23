package com.dream.sampleserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam; 

@RestController("/")
public class SampleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/send-message")
	public void sendMessage(@RequestParam final String product) {
		LOGGER.info(String.format("Query is: %s", product));
	}
}

// q=Kaban&order=incPrice

/*

curl -X GET localhost:8080/send-message?q=Kaban&order=incPrice


*/