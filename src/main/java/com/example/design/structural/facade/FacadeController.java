package com.example.design.structural.facade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacadeController {
	
	@GetMapping("/facade")
	public String getMessage() {
		Computer computer = new Computer();
		computer.startComputer();
		return "facade";
	}
}
