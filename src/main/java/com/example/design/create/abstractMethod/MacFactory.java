package com.example.design.create.abstractMethod;

/**
 * MAC用ファクトリー
 */
public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
