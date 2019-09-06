package com.revature.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		String path = "src/com/revature/io/text.txt";
			//write("writing this to file", path );
		read(path);
	
	}
	static void writeString(String text, String filepath) {
		BufferedWriter bw;
			try {
				bw = new BufferedWriter(new FileWriter(filepath));
				bw.write(text);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
			//	bw.close();
			}
	}
	
	static void write(String text, String filepath) {
		//create buffered writer using try with resources
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))){
			bw.write(text + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void read(String filepath) {
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
			
			String currString = null;
			while((currString = br.readLine()) != null) {
				System.out.println(currString);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
