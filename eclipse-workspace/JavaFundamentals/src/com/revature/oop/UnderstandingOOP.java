package com.revature.oop;

public class UnderstandingOOP {
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog.consume());
		System.out.println(myDog.type);
		myDog.forDogsOnly();
		System.out.println(myDog.animalVar);
		
		Animal pup= new Dog();
		System.out.println(pup.type);
		System.out.println(pup.animalVar);
		
	
		//Poodle p = new Poodle();
		
		
	}

}
