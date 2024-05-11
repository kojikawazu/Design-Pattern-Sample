package com.example.design.structural.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void startComputer() {
		cpu.freeze();
		memory.load(0, hardDrive.read(0, 10));
		cpu.jump(0);
		cpu.execute();
	}
}
