package com.example.design.create.singleton;

/**
 * シングルトンクラス
 * (デザインパターン)
 */
public class Singleton {
	private static final Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("シングルトンクラスです");
	}
}
