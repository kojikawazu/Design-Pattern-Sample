package com.example.design.behavioral.state;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

	@GetMapping("/state")
	public String getMessage() {
		TrafficLight light = new TrafficLight(new RedState());
		light.change();
		light.change();
		light.change();
		return "state";
	}
}
