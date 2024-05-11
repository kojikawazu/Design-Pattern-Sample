package com.example.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
	private static final Map<String, Font> fonts = new HashMap<>();
	
	public static Font getFont(String key) {
		Font font = fonts.get(key);
		if (font == null) {
			String[] parts = key.split(":");
			font = new Font(parts[0], Integer.parseInt(parts[1]));
			fonts.put(key, font);
		}
		return font;
	}
}
