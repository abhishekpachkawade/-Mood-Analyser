package com.bl.abhishek;

public class MoodAnalyser {

	//method analysermood with passing parameter 
	public String analyserMood(String message) {
		if (message.contains("sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}
