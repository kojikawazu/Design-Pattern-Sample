package com.example.design.behavioral.visitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

	@GetMapping("/visitor")
	public String getMessage() {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
		return "visitor";
	}
}
