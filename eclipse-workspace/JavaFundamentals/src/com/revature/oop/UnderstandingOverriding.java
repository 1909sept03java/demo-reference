package com.revature.oop;

public class UnderstandingOverriding {
	/*
	 * When overriding methods, we cannot override private 
	 * methods as they only live within the class theyre 
	 * declared in 
	 * We can NOT make an overridden method more private than 
	 * its superclass's method. it can only be of the same level
	 * of access or more public 
	 */
	
	public static void main(String[] args) {
		A a = new A();
	
	}

}

class A{
	private void doThings() {
		System.out.println("this method has default access");
	}
}

class B extends A{
	
}
