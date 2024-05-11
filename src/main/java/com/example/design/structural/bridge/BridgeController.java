package com.example.design.structural.bridge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BridgeController {
	
	@GetMapping("/bridge")
	public String getMessage() {
		Device tv = new TV();
		RemoteControl remote = new RemoteControl(tv);
		
		remote.togglePower();
		remote.volumeUp();
		remote.channelUp();
		
		System.out.println("TV after using remote.");
		System.out.println("TV is on: " + tv.isEnabled());
		System.out.println("TV Volume: " + tv.getVolume());
		System.out.println("TV Channel: " + tv.getChannel());
		
		return "bridge";
	}
}
