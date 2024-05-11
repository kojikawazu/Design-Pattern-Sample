package com.example.design.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVideo(fileName);
		} else {
			advancedMusicPlayer.playAudio(fileName);
		}
	}
}
