package com.example.design.behavioral.memento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MementoController {

	@GetMapping("/memento")
	public String getMessage() {
		TextEditor editor = new TextEditor();
		Caretaker caretaker = new Caretaker();
		
		editor.setText("Version 1");
		caretaker.addMemento(editor.saveToMemento());
		editor.setText("Version 2");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.restoreFromMemento(caretaker.getMemento(0));
		System.out.println(editor.getText());
		
		return "memento";
	}
}
