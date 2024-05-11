package com.example.design.structural.flyweight;

public class Font {
	private final String color;
	private final int size;
	
	public Font(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Font{" +
				"color='" + color + '\'' +
				", size='" + size + '\'' +
				'}';
	}
}
