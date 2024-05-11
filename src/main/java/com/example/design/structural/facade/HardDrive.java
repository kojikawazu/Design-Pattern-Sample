package com.example.design.structural.facade;

public class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("Reading from hard drive");
		return new byte[] {1, 2, 3};
	}
}
