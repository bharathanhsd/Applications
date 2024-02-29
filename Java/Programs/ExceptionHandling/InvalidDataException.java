package com.classroom.day4.main;

// InvalidDataException.java
public class InvalidDataException extends Exception {
	public String getMessage() {
		return "Name must be provided.";
	}
	
}

