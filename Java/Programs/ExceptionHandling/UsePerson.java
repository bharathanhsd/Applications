package com.classroom.day4.main;

// UsePerson.java
public class UsePerson {
	public static void main(String[] args)  {
		Person p = null;
		String name = null;
		Integer age = null;

		// in reality - get name from end user or other place

		// comment out next line to see exception!
		//name = "fwerEd";
		age = 12;
		//name = args[0];
		//age = Integer.parseInt(args[1]);

		try {
			p = new Person(name, age);
		}
		catch(InvalidDataException  e) {   //catch(InvalidDataException | BadNameException e) {
			System.err.println(e.getMessage());
		}catch (BadNameException e) {
			System.err.println(e.getMessage());
		}catch (BadAgeException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}

		if (p != null)
			System.out.println("We got a Person created!");
	}
}
