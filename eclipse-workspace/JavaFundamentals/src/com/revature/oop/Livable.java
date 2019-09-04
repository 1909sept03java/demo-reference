package com.revature.oop;

public interface Livable {
	
	int x=5; //public static final by default
	
	/*
	 * An interface in Java is an abstract type that 
	 * is used to specify behavior that classes must implement 
	 * 
	 * Interfaces are commonly referred to as "contracts"
	 * and if some class implements an interface, it is 
	 * signing the contract and agreeing to provide 
	 * functionality specified in the contract 
	 * 
	 * In interfaces, every method IMPLICITLY has the modifiers 
	 * abstract and public 
	 * 
	 * Since Java 8, we now have the ability to give methods 
	 * default implementation. We can also make static methods 
	 * in interfaces, but they do not get overriden
	 */
	
	int reproduce();
	String communicate();
	String consume();
	
	/*
	 * DEFAULT METHODS IN JAVA 
	 * - new feature since Java 8
	 * - allows us to implement methods in interfaces 
	 * - used so that we can update interfaces without having to 
	 * rewrite all classes that implement that interface 
	 * - these methods can still be overriden if you wish
	 */
	default void survive() {
		System.out.println("stayin alive");
	}
	

}
