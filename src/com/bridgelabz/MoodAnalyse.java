package com.bridgelabz;

public class MoodAnalyse {
	
	private String message;	
	public MoodAnalyse() {
		
	}
	
	public MoodAnalyse(String message) {
		this.message = message;
  }
  
	public String returnEmotion() {
		try {
			if(message.equals("I am in sad mood")) {
				return "Sad";
			}
			else if(message.equals("I am in any mood")) {
				return "happy";
			}
			else {
				throw new NullPointerException();
			}
		} catch (Exception e) {
			System.out.println("Null message found");
			return "Happy";
		}		
	}		
}
