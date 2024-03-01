/**
 * 
 */
package com.classroom.day1.main;

import com.classroom.day1.entity.Dog;

public class TestDog {

	public static void main(String[] args) {
		Dog brownDog = new Dog("BrownDog", "Brown", 1.22 , 2.55, false);
		Dog whiteDog = new Dog("WhiteDog", "White", 1.55 , 2.55, false);
		Dog blackDog = new Dog("BlackDog", "Black", 1.567 , 2.55, true);
		Dog redDog	 = new Dog("RedDog", "Red", 1.567 , 2.54, true);
		
		System.out.println("Testing To String function...!!");
		System.out.println("White Dog says: "+whiteDog);
		System.out.println("Black Dog says: "+blackDog.toString());
		System.out.println("Brown Dog says: "+brownDog.toString());
		System.out.println("Red Dog says: "+redDog);
		System.out.println();
		
		System.out.println("Testing equals function...!!");
		System.out.println("White Dog and Brown dogs are Equal, Is this true?  Answer: "+whiteDog.equals(brownDog));
		System.out.println("White Dog and Black dogs are Equal, Is this true?  Answer: "+whiteDog.equals(blackDog));
		System.out.println("Brown Dog and Black dogs are Equal, Is this true?  Answer: "+brownDog.equals(blackDog));
		System.out.println("Red Dog and Black dogs are Equal, Is this true?  Answer: "+redDog.equals(blackDog));

	}
}
