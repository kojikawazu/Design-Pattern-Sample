package com.example.design.create.prototype;

public class Document implements Cloneable {
	private String title;
	private String content;
	
	public Document(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public Document clone() {
		try {
			return (Document)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	@Override
	public String toString() {
		return "Document{" +
				"title='" + title + '\'' + 
				", content=" + content + '\'' +
				'}';
	}
}
