package com.revature.oop;

/* Abstract classes in Java are classes that have 
 * the ABILITY to have abstract methods, and do not 
 * have the ability to be instantiated
 * 
 * In order to be abstract, all we must do is use the 
 * keyword abstract when declaring our class
 * 
 * abstract classes do NOT need to have abstract methods, 
 * they simply have the ability too 
 * 
 * Also, weird note, abstract classes CAN have constructors 
 * even though they cannot be instantiated
 * 
 * More on that here... https://www.java67.com/2013/02/can-abstract-class-have-constructor-in-java.html
 */
public class Animal implements Livable {
	public String type = "animal";
	public String animalVar = "all animals";
	
	//abstract void move();
	
	@Override
	public String consume() {
		return "Yum! I am eating  good food!";
	}

	@Override
	public int reproduce() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}
}
