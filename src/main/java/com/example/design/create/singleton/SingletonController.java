package com.example.design.create.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * シングルトンコントローラー
 */
@RestController
public class SingletonController {

	@GetMapping("/singeton")
	public String ShowMessage() {
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
		return "singleton";
	}
}
