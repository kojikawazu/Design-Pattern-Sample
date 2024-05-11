package com.example.design.structural.flyweight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlyweightController {
	
	@GetMapping("/flyweight")
	public String getMessage() {
		Font font1 = FontFactory.getFont("Red:12");
		Font font2 = FontFactory.getFont("Red:12");
		Font font3 = FontFactory.getFont("Blue:12");
		
		System.out.println(font1);
		System.out.println(font2);
		System.out.println(font3);
		
		System.out.println("Checking if font1 and font2 are the same object: " + (font1 == font2));
		System.out.println("Checking if font1 and font2 are the same object: " + (font1 == font3));
		
		return "flyweight";
	}
}
