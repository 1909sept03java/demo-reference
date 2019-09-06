package com.revature.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnderstandingExceptions {

	/*
	 * Exceptions in Java are objects that are thrown 
	 * up the stack at runtime halting the execution of 
	 * your application when something goes wrong 
	 * They are typically recoverable if handled properly
	 * 
	 * An exception can be "handled" by either catching 
	 * it at the moment it's thrown or by having the 
	 * method that it is thrown in further throw it up 
	 * the stack or "propagate" it. (also known as ducking)
	 * 
	 * Topics to cover:
	 * - Throwable API
	 * - Errors vs Exceptions 
	 * - RuntimeExceptions(unchecked) vs compile-time(checked)
	 * - how to handle exceptions - catch vs throw 
	 * - throw vs throws 
	 * - try-catch, try-catch-finally 
	 * - create our own exceptions
	 * - common exceptions to know 
	 */

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 6, 7};
		throwsRuntime(arr);
	}

	static void run() {
		System.out.println("Enter a number");
		String numString = scanner.nextLine();
		try {
			int num = Integer.parseInt(numString);
		}
		catch(NumberFormatException e) {
			System.out.println("You entered an invalid value. please try again!");
			run();
		}
	}
	
	static void runWithNextInt() {
		System.out.println("Enter a number");
		try {
			int num = scanner.nextInt();
			System.out.println("you entered " + num);
		} catch(InputMismatchException e) {
			System.out.println("You entered an invalid value. please try again!");
			//run();
		}
	}
	
	static void throwsRuntime(int[] arr) throws  ArrayIndexOutOfBoundsException{
		System.out.println(arr[10]);
	}
	
	
	static void methodA() throws Exception{
		throw new Exception();
	}
	
	static void methodB() {
		//methodA();
	}


}
