package com.example.design.behavioral.visitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor visitor);
}
