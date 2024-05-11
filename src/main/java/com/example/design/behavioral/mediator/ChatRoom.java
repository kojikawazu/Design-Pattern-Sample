package com.example.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
	private List<User> users;
	
	public ChatRoom() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : users) {
			if (u != user) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
}
