package com.example.design.create.factoryMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ファクトリーメソッドコントローラー
 */
@RestController
public class FactoryMethodController {
	
	@GetMapping("/factoryMethod")
	public String showMessage() {
		DocumentCreator creator = new PdfCreator();
		Document doc = creator.getDocument();
		creator = new WordCreator();
		doc = creator.getDocument();
		
		return "factoryMethod";
	}
}
