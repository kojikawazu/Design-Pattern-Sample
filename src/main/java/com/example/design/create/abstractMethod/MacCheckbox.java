package com.example.design.create.abstractMethod;

public class MacCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Rendering a checkbox in a Mac style");
	}
}
