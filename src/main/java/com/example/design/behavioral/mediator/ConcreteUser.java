package com.example.design.behavioral.mediator;

public class ConcreteUser extends User {

	public ConcreteUser(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sending Message = " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Receive Message = " + msg);
	}
}
