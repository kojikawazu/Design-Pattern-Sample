package com.example.design.create.factoryMethod;

public class PdfCreator extends DocumentCreator {

	@Override
	public Document createDocument() {
		return new PdfDocument();
	}
}
