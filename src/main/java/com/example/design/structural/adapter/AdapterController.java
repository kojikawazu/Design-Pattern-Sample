package com.example.design.structural.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterController {

	@GetMapping("/adapter")
	public String getMessage() {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("vlc", "beyond_the_horizon.vlc");
		return "adapter";
	}
}
