package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void analyseMood() {
		MoodAnalyse moodAnalyse = new MoodAnalyse();
		assertEquals("happy",moodAnalyse.returnEmotion());
	}

}
