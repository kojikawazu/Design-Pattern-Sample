package com.example.design.behavioral.visitor;

public interface ComputerPartVisitor {
	void visit(Computer computer);
	void visit(Mouse mouse);
	void visit(Keyboard keyboard);
	void visit(Monitor monitor);
}
