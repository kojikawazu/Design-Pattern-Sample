package com.example.design.structural.facade;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Memory load from " + position);
	}
}
