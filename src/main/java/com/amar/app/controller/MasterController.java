package com.amar.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {

	@GetMapping("/welcome")
	public String getGreetingMsg() {
		return "Success";
	}

}
