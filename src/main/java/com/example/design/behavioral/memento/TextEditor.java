package com.example.design.behavioral.memento;

public class TextEditor {
	private String content;
	
	public void setText(String text) {
		content = text;
	}
	
	public String getText() {
		return content;
	}
	
	public TextMemento saveToMemento() {
		return new TextMemento(content);
	}
	
	public void restoreFromMemento(TextMemento memento) {
		content = memento.getState();
	}
}
