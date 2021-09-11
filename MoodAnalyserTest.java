package com.bl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.abhishek.MoodAnalyser;
import com.bl.abhishek.MoodAnalyserException;

public class MoodAnalyserTest {

	//Creating object of MoodAnalyser
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	//Method to return sad mood
	@Test
	public void givenMessage_ToMoodAnalyser_ShouldBeReturnSad() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String  mood = moodAnalyser.analyserMood();
        try
        {
            mood = moodAnalyser.analyserMood();
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
       assertEquals("sad" , mood);
    }

	//Method to return Happy mood
	@Test
	public void givenMessage_ToMoodAnalyser_ShouldBeReturnHappy()throws MoodAnalyserException
    {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyserMood();
        try
        {
            mood = moodAnalyser.analyserMood();
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
       assertEquals("Happy" , mood);
    }
	
	// Handles Exception
	@Test
	public void givenMessageNull_ToMoodAnalyser_ShouldBeReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyserMood();
        } catch (MoodAnalyserException e)
        {
            assertEquals("Please enter valid message", e.getMessage());
            System.out.println("Enter valid message");
        }
}
}
