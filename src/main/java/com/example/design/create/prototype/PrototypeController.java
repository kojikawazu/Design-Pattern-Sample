package com.example.design.create.prototype;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {

	@GetMapping("/prototype")
	public String getMessage() {
		Document original = new Document("Original", "This is the original.");
		Document clone = original.clone();
		clone.setTitle("Clone");
		clone.setContent("This is the cloned document.");
		
		System.out.println(original);
		System.out.println(clone);
		return "prototype";
	}
}
