package com.revature.intro;

/*
 * A constructor in Java is a block of code 
 * that is similar to a method (not technically 
 * a method as it does not have a return type)
 * that gets called when an instance of a class
 * is created. 
 * 
 * All classes have an implicit or DEFAULT 
 * constructor unless one is defined 
 * 
 * The first line of ANY constructor MUST be 
 * either a call to the super class's constructor
 * super()
 * OR a call to another constructor in the current class 
 * this()
 * if we put neither, the first line is an 
 * implicit call to the super class's no argument constructor
 * 
 * more info:
 * https://www.dummies.com/programming/java/how-to-use-a-constructor-in-java/
 * 
 * 
 * 	 */
public class Constructors {
	public static void main(String[] args) {
		C c = new C();
	}
}


class A{
	A(){
		//super();
		System.out.println("IN CLASS A CONSTRUCTOR");
	}
}

class B extends A{
	B(){
		//super();
		System.out.println("IN CLASS B CONSTRUCTOR");
	}
}

class C extends B{
	C(){
		//super();
		System.out.println("IN CLASS C CONSTRUCTOR");
	}
}