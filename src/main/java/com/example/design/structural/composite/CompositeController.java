package com.example.design.structural.composite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositeController {

	@GetMapping("/composite")
	public String getMessage() {
		CompositeGraphic graphic = new CompositeGraphic();
		graphic.add(new Circle());
		graphic.add(new Rectangle());
		
		CompositeGraphic subGraphic = new CompositeGraphic();
		subGraphic.add(new Circle());
		subGraphic.add(new Rectangle());
		
		graphic.add(subGraphic);
		graphic.draw();
		return "composite";
	}
}
