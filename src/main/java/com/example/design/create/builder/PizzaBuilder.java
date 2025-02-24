package com.example.design.create.builder;

abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
