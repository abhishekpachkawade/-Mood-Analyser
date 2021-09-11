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
	public String analyserMood() throws MoodAnalyserException {

		// Handles Exceptions using try catch block
		try {
			if (message.length() == 0) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
						"Please enter valid message");
			}
			if (message.contains("sad"))
				return "sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,
					"Please enter valid message");
		}
	}
}
