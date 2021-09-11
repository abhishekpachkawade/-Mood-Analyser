package com.bl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.abhishek.MoodAnalyser;

public class MoodAnalyserTest {

	//Creating object of MoodAnalyser
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	//Method to return sad mood
	@Test
	public void givenMessage_ToMoodAnalyser_ShouldBeReturnSad() {
		String message = moodAnalyser.analyserMood("I am in sad mood");
		assertEquals("Sad", message);
		System.out.println(message);
	}

	//Method to return Happy mood
	@Test
	public void givenMessage_ToMoodAnalyser_ShouldBeReturnHappy() {
		String message = moodAnalyser.analyserMood("I am in happy mood");
		assertEquals("Happy", message);
		System.out.println(message);
	}
	
	 // Handles Exception
	@Test
	public void givenMessageNull_ToMoodAnalyser_ShouldBeReturnHappy() {
		String message = moodAnalyser.analyserMood("");
		assertEquals("Happy", message);
		System.out.println(message);
	}
}
