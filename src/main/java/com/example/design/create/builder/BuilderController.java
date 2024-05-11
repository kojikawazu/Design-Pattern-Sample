package com.example.design.create.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuilderController {

	@GetMapping("/builder")
	public String getMessage() {
		Cook cook = new Cook();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
		Pizza pizza = cook.getPizza();
		System.out.println("Pizza built: " + pizza);
		
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
		pizza = cook.getPizza();
		System.out.println("Pizza built: " + pizza);
		
		return "builder";
	}
}
