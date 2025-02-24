package com.example.design.structural.proxy;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String filaName) {
		this.fileName = filaName;
		loadFromDisk(filaName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
}
