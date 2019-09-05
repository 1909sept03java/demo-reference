package com.revature.codingchallenges;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number n for fizzbuzz");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString); 
		//but what happens if we didn't pass in something that can be parsed?
		fizzBuzz(num);
	
	}
	
	static void fizzBuzz(int num) {
		for(int i = 1; i <= num; i++) {
			if(i % 15 == 0) System.out.println("FizzBuzz");
			else if(i % 3 == 0) System.out.println("Fizz");
			else if(i % 5 == 0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}

}
