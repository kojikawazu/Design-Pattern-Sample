package com.example.design.behavioral.strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {

	@GetMapping("/strategy")
	public String getMessage() {
		ShoppingCart cart = new ShoppingCart();
		cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456"));
		cart.checkout(100);
		
		cart.setPaymentStrategy(new PaypalStrategy("john@example.com"));
		cart.checkout(200);
		return "strategy";
	}
}
