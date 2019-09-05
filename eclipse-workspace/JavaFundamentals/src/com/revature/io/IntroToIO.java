package com.revature.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IntroToIO {
	/*
	 * File IO in Java is the mechanism we use to read from and 
	 * write to files. 
	 * 
	 * Classes associated with writing to files are: 
	 * BufferedWriter 
	 * FileWriter 
	 * 
	 * Classes associated with reading from files are:
	 * BufferedReader 
	 * FileReader
	 * 
	 * Associated topic of discussion:
	 * try-with-resources 
	 * - this is a parameterized try block where we the parameter 
	 * is the instantiation of a "resource"(object we need) that 
	 * implements the autocloseable interface
	 * - we now no longer need to explicitly close this resource 
	 */
	
	public static void main(String[] args)  {

			writeString("test", "src/com/revature/io/text.txt");
	
	}
	
	static void writeString(String text, String filepath) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
				bw.write(text);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 throw new IOException();
	}
}
