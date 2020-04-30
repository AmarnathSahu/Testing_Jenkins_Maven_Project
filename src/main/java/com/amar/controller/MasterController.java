package com.amar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {

	@GetMapping
	public String getGreetingMsg() {
		return "Success";
	}

}
