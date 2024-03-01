/**
 * 
 */
package com.myexample.concepts.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 
 */
public class JavaStreamsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> PersonList = new ArrayList<Person>();
		PersonList.add(new Person("Rajesh", 120));
		PersonList.add(new Person("Suresh", 20));
		PersonList.add(new Person("Amith", 1220));
		PersonList.add(new Person("Bharath", 2220));
		PersonList.add(new Person("Vinay", 200));
		
		List<Person> filteredPersonList = PersonList.stream()
				.filter(person -> person.billions >=100).collect(Collectors.toList());
		
		List<Person> sortedPersonList = PersonList.stream()
				.sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
		
		List<Person> filteredSortPersonList = PersonList.stream()
				.filter(person -> person.billions >=100)
				.sorted(Comparator.comparing(person -> person.name))
				.collect(Collectors.toList());
		
		/*
		for (Person person : filteredPersonList) {
			System.out.println(person.name);
			
		}
		
		for (Person person : sortedPersonList) {
			System.out.println(person.name);
			
		} */
		
		for (Person person : filteredSortPersonList) {
			System.out.println(person.name);
			
		}
	}
	
	
	static class Person{
		String name;
		Integer billions;
		
		public Person(String name, Integer billions) {
			this.name = name;
			this.billions = billions;
		}
	}

}
