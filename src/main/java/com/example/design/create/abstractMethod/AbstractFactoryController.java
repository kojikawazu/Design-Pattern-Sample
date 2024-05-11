package com.example.design.create.abstractMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbstractFactoryController {

	@GetMapping("/abstractFactory")
	public String getMessage() {
		GUIFactory guiFactory = new WindowsFactory();
		guiFactory.createButton().paint();
		guiFactory.createCheckbox().paint();
		guiFactory = new MacFactory();
		guiFactory.createButton().paint();
		guiFactory.createCheckbox().paint();
		
		return "abstractFactory";
	}
}
