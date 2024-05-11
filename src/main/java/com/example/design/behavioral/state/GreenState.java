package com.example.design.behavioral.state;

public class GreenState implements TrafficLightState {

	@Override
	public void change(TrafficLight trafficLight) {
		System.out.println("Green light - go");
		trafficLight.setState(new YellowState());
	}
}
