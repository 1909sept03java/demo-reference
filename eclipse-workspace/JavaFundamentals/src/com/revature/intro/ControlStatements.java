package com.revature.intro;

public class ControlStatements {

	/*
	 * When we need to execute a set of statements based 
	 * on a condition then we need to use control flow 
	 * statements. For example, if a number is greater than 
	 * zero then we want to print �Positive Number� but if 
	 * it is less than zero then we want to print �Negative 
	 * Number�. In this case we have two print statements in 
	 * the program, but only one print statement executes at 
	 * a time based on the input value. We will see how to 
	 * write such type of conditions in the java program 
	 * using control statements.
	 * 
	 * Assignment: With a partner, 
	 * go through the control statements tab in this site
	 * https://beginnersbook.com/2017/08/if-else-statement-in-java/ 
	 * and code one example of each of the following:
	 * if statement, nested if statement, if-else statement, 
	 * if-else if- else statement, for loop, for each loop,
	 * while loop, do while loop, and switch statement
	 * 
	 */

	

	public static void main(String args[]) {
		// FOR LOOP
		//for([initialize counter]; [set bounds for counter]; [change counter])
		for(int i = 0; i < 10;  i++) {
			System.out.println("doing things!");
			if(i%2==0) continue;
			System.out.println(i);
		}
		System.out.println("vs pre increment ");
		
		for(int i = 0; i < 10;  ++i) {
			System.out.print(i + ", ");
		}
		
	}
	
	static void statements() {
		String[] args = {"hi"};
		int num = 1;
		//initialized var; bounds for loop; change var val
		for( ; ; ) { //valid for loop
			
			
			num += 2;
			if(num == args.length) break;
		}
		
		// FOR-EACH AKA ENHANCED FOR LOOP
		for(String str: args) {
			for(int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
			}
			System.out.println(str);
		}
		
		//WHILE - executes while condition is true
		while(true) {
			System.out.println("this works");
			break;
		}
		
		//DO-WHILE - executes once then repeats if cond is true
		do {
			System.out.println("doing things");
		} while(num > 1);
		
		//IF - checks condition
		if(num <= 1) {
			System.out.println("num is 1");
		}
		else if(num == 5 || num == 10) {
			System.out.println("num is 5");
		}
		else {
			System.out.println("oops! wrong input");
		}
		
		
		
		//SWITCH STATEMENTS
		/*
		 * Can only be used for Strings, enums, and values 
		 * that can be cast up to int 
		 * --> int, short, byte, char (and their respective 
		 * wrapper classes)
		 */
		switch(num) {
		case 100: System.out.println(1); 
			break; 
		case 5: 
			System.out.println(5);
			break;
		case 10: System.out.println(10); break;
		default: System.out.println("IDK what number this is");
		}
		
		String test = "";
		switch(test) {
		case "hello": break;
		}
		
		double d = 10.02;
		
		
		/*
		 * BREAK vs CONTINUE
		 * break will exit the loop or block of code
		 * continue will move on to the next iteration of the loop 
		 */
	}
	
	
	
}
