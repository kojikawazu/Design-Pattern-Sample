package com.example.design.behavioral.state;

public class RedState implements TrafficLightState {

	@Override
	public void change(TrafficLight trafficLight) {
		System.out.println("Red light - stop");
		trafficLight.setState(new GreenState());
	}
}
