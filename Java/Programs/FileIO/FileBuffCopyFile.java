/**
 * 
 */
package com.classroom.day5.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileBuffCopyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String line;

		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\createdFile.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\temp\\createdFile-Copy.txt"));
			while ((line = reader.readLine()) != null) {
				writer.write(line+"\n");
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println("Exception occured.. : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
