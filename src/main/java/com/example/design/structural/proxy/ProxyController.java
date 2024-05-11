package com.example.design.structural.proxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

	@GetMapping("/proxy")
	public String getMessage() {
		Image image = new ProxyImage("test_image.jpg");
		image.display();
		image.display();
		return "proxy";
	}
}
