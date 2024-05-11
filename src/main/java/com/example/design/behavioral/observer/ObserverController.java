package com.example.design.behavioral.observer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObserverController {

	@GetMapping("/observer")
	public String getMessage() {
		NewsAgency newsAgency = new NewsAgency();
		NewsChannel newsChannel = new NewsChannel();
		
		newsAgency.registerObserver(newsChannel);
		newsAgency.setNews("Breaking News: Java makes a comeback!");
		return "observer";
	}
}
