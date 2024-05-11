package com.example.design.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVideo(String fileName) {
		System.out.println("Playing vlc video file. Name: " + fileName);
	}

	@Override
	public void playAudio(String fileName) {
		System.out.println("Playing vlc audio file. Name: " + fileName);
	}
}
