package com.example.design.create.factoryMethod;

public class WordCreator extends DocumentCreator {

	@Override
	public Document createDocument() {
		return new WordDocument();
	}
}
