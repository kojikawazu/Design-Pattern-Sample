package com.example.design.behavioral.memento;

public class TextMemento {
	private final String state;
	
	public TextMemento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
