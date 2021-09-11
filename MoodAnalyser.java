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

		// Handles Exceptions using try catch block
		try {

			if (message.contains("sad"))
				return "Sad";
			else
				return "Happy";

		} catch (Exception e) {

			return "Happy";

		}
	}
}
