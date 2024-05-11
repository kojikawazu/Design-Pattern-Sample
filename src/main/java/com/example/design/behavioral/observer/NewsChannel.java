package com.example.design.behavioral.observer;

public class NewsChannel implements Observer {
	private String news;
	
	@Override
	public void update(String message) {
		this.news = message;
		System.out.println("NewsChannel updated width nes: " + news);
	}
}
