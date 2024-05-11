package com.example.design.structural.adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}
