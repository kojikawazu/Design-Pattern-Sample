package com.example.design.create.abstractMethod;

/**
 * ウィンドウズ用ボタン
 */
public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Randering a button in a Windows style.");
	}
}
