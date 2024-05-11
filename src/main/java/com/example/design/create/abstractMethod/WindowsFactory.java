package com.example.design.create.abstractMethod;

/**
 * ウィンドウズ用ファクトリー
 */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
