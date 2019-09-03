package com.revature.intro;

public class VariableScopes {
	
	/*
	 * the scope of a variable is simply where the variable is accessible 
	 * within a class, based on where and how the variable is declared
	 * 
	 * instance/object - accessible from all INSTANCE METHODS
	 *  cannot access instance scoped entities from non 
	 *  instance scoped entities without an instance
	 *  - these are fields declared outside of any method 
	 *  and without the static keyword 
	 *  
	 * static/class - accessible everywhere within a class. 
	 * 	also able to be accessed from the class name itself 
	 *  without an instance from other classes
	 *  - declared outside of any method or block WITH 
	 *  the static keyword 
	 *  
	 * method scope - declared within method OR passed in 
	 * 	as parameter to method
	 * 
	 * block - within curly braces(loops, if statements, 
	 * 	static blocks, etc)
	 */
	
	public String myInstanceVar;
	public static String myStaticVar;
	
	public static void main(String[] args) {
		String myName = "Genesis"; //METHOD SCOPE 
		
		for(int i = 0; i < 10 ; i++) { //BLOCK SCOPE
			System.out.println(myName);
			int temp = 0;
		}
		
	//	i++;
	//	System.out.println(temp);
		
	}
	
	public static void test() {
		//System.out.println(myName);
	}
	

}
