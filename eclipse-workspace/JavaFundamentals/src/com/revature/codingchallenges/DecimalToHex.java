package com.revature.codingchallenges;

import java.util.Scanner;

public class DecimalToHex {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What number would you like to convert?");
		String numString = scan.nextLine();
		int n = Integer.parseInt(numString); //should do exception handling, will do later
		String correct = Integer.toHexString(n);
		String myAnswer = intToHex(n);
		
		if(correct.equalsIgnoreCase(myAnswer)) {
			System.out.println("Passed! " + numString + " in hex is " + myAnswer);
		} else {
			System.out.println("Sorry, " + numString + " in hex is " + correct 
				+ " but your answer was " + myAnswer);
		}
	}
	
	public static String intToHex(int num){
		String out = "";
		int rem = 0;
		
		while(num>0){
			rem = num%16;
			out = (rem > 9 ?  Character.toString((char)(rem+87)) : rem) + out;
			//same thing as the following:
//			if(rem > 9) {
//				char temp = (char) (rem + 87);
//				out = temp + out;
//			} else {
//				out = rem + out;
//			}
			num/=16;
		}
		
		return out;
	}

}
