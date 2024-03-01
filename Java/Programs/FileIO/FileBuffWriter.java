/**
 * 
 */
package com.classroom.day5.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileBuffWriter {

	public static void main(String[] args) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\temp\\createdFile.txt"));
			writer.write("Writing 1st line...!!");
			writer.write("\n Writing 2nd line...!!");
			writer.write("\n Writing 3rd line...!!");
			writer.write("\n Writing 4th line...!!");
			writer.write("\n Writing 5th line...!!");
			writer.write("\n Writing 6th line...!!");
			writer.close();
		} catch (IOException e) {
			System.out.println("Exception occured. : "+e.getMessage());
			e.printStackTrace();
		}
		

	}

}
