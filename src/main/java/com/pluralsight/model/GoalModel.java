package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class GoalModel {
	@Range(min = 1, max = 150)
	private int minutes;
	
	private String message;

	

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
