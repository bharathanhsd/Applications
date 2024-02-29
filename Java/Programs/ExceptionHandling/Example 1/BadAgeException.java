/**
 * 
 */
package com.classroom.day4.main;

/**
 * 
 */
public class BadAgeException extends Exception {

	private Integer age;

	public BadAgeException(Integer inputAge) {
		age = inputAge;	
	}
	
	public String getMessage() {
		return "Person is under the age of 18 not allowed and user entered : "+age;
	}

}
