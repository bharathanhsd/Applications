package com.classroom.day5.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffReader {

	public static void main(String[] args) {
		String line;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\createdFile.txt"));
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Exception occured.. : "+e.getMessage());
			e.printStackTrace();
		}
		

	}

}
