package com.example.design.behavioral.state;

public class YellowState implements TrafficLightState {

	@Override
	public void change(TrafficLight trafficLight) {
		System.out.println("Yellow light - caution");
		trafficLight.setState(new RedState());
	}
}
