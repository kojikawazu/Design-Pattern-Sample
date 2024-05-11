package com.example.design.create.abstractMethod;

/**
 * ウィンドウズ用チェックボックス
 */
public class WindowsCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Rendering a checkbox in a Windows style");
	}
}
