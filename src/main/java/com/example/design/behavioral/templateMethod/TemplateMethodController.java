package com.example.design.behavioral.templateMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateMethodController {

	@GetMapping("/templateMethod")
	public String getMessage() {
		Game game = new Football();
		game.play();
		return "templateMethod";
	}
}
