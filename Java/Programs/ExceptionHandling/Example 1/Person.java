package com.classroom.day4.main;

// Person.java
public class Person {
	private String name;
	private Integer age;

	public Person(String n, Integer inputAge) throws InvalidDataException, BadNameException, BadAgeException {
		if (null == n || "".equals(n)) {
			throw new InvalidDataException();
		}
		if("FRED".equalsIgnoreCase(n)) {
			throw new BadNameException();
		}
		if(null == age || age < 18) {
			throw new BadAgeException(inputAge);
		}
		name = n;
		age = inputAge;
	}

	public String toString() {
		return name;
	}
}
