package com.bridgelabz;

public class MoodAnalyse {
	
	private String message;

	public MoodAnalyse(String message) {
		this.message = message;
	}
	
	public String returnEmotion() {
		if(message == "I am in sad mood") {
			return "Sad";
		}
		else if(message == "I am in any mood") {
			return "happy";
		}
		return "Happy";
	}
	 
	
		
}