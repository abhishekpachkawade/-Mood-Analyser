package com.bl.abhishek;

public class MoodAnalyser {

	// private variable
	private String message;

	// Constructor
	public MoodAnalyser() {
	}

	// Constructor one parameter
	public MoodAnalyser(String message) {
		this.message = message;
	}

	// method analysermood with passing parameter
	public String analyserMood(String message) {
		if (message.contains("sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}
