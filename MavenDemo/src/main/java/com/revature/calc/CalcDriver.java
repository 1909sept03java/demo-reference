package com.revature.calc;

import java.util.Scanner;

public class CalcDriver {

	// entry point of a Java program
	public static void main(String[] args) {
		Double answer;
		Calculator c = new Calculator();
		Scanner scanner = new Scanner(System.in);
		boolean keepGoing = true;
		
		do {
			try {

				System.out.println("What numbers would you like to add?");
				if (scanner.hasNext()) {
					answer = c.add(scanner.next());
					System.out.println("Your answer is: " + answer);
					System.out.println("Add more numbers? y/n");
					if (scanner.next().equals("y")) {
						continue;
					} else if (scanner.next().equals("n")){
						keepGoing = false;
					}
				}

			} catch (Exception e) {
				System.out.println("Try again ;)");
			}
		} while (keepGoing);
		scanner.close();

	}

}
