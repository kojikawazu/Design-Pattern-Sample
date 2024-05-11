package com.example.design.create.abstractMethod;

/**
 * MAC用ボタン
 */
public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("Rendering a button in a Mac style");
	}
}
