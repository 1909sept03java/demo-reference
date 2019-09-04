package com.revature.oop;

public class Dog extends Animal{
	
	public String type = "Dog";
	
	public Dog() {
		super.animalVar = "now this is a dog";
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

	@Override
	public String consume() {
		System.out.println("DOG CONSUME METHOD");
	//	System.out.println(super.consume());
		return "puppy chow";
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	void forDogsOnly() {
		System.out.println("for dogs only");
	}



}
