package com.example.design.behavioral.mediator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediatorController {

	@GetMapping("/mediator")
	public String getMessage() {
		ChatMediator mediator = new ChatRoom();
		User user1 = new ConcreteUser(mediator, "John");
		User user2 = new ConcreteUser(mediator, "Doe");
		User user3 = new ConcreteUser(mediator, "Smith");
		User user4 = new ConcreteUser(mediator, "Alice");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi ALL");
		
		return "mediator";
	}
}
