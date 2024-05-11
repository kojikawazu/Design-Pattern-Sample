package com.example.design.create.factoryMethod;

abstract class DocumentCreator {
	public abstract Document createDocument();
	
	public Document getDocument() {
		Document doc = createDocument();
		doc.displayInfo();
		return doc;
	}
}
