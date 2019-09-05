package com.revature.oop;

public class UnderstandingOOP {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		
		
		Animal a = d;
		
		Cat c = (Cat) a; //throws ClassCastException
		
		System.out.println(c.animalVar);
	}

}
