package com.example.design.behavioral.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {

	@GetMapping("/command")
	public String getMessage() {
		Light light = new Light();
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		RemoteControl control = new RemoteControl();
		control.setCommand(lightsOn);
		control.pressButton();
		control.setCommand(lightsOff);
		control.pressButton();
		
		return "command";
	}
}
