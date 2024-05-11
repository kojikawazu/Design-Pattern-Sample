package com.example.design.behavioral.state;

public class TrafficLight {
	private TrafficLightState state;
	
	public TrafficLight(TrafficLightState state) {
		this.state = state;
	}
	
	public void setState(TrafficLightState state) {
		this.state = state;
	}
	
	public void change() {
		state.change(this);
	}
}
