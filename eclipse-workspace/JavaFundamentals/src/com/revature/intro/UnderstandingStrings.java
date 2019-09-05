package com.revature.intro;

public class UnderstandingStrings {
	/*
	 * Strings in Java represent a series of characters
	 * - immutable 
	 * - "" literal 
	 * - two ways to create
	 * 	-> String hello = "hello"; (created in string pool)
	 *  -> String hello2 = new String("hello"); (created as regular object in heap memory)
	 */

	public static void main(String[] args) {
		String str = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str == str3); //false
		/*
		 * Object class has a .equals() method
		 * which would look like obj1.equals(obj2); 
		 * the object class implementation just 
		 * returns the output of ==, which returns 
		 * true if the two object references refer 
		 * to the same exact object in memory,NOT 
		 * just for content equality 
		 * But, the string class overrides the .equals
		 * method so that it tests for equality of the 
		 * content, not just the location in memory 
		 */
		System.out.println(str.equals(str3));
		String str4 = "HElLo";
		System.out.println(str.equalsIgnoreCase(str4));

	}
	
	/*
	 * immutable - once created, cannot be changed 
	 * 
	 * Strings are immutable but two mutable solutions to this exist:
	 * - StringBuilder 
	 * - StringBuffer(rarely used, slower than stringbuilder, but thread safe)
	 */
	static void mutableStrings() {
		String a = "hello";
		a = new String("hi").concat(" world!").concat(" test");
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder("hello");
		//StringBuilder sb2 = "hi"; //will not work 
		
		sb.append(" world");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("test");
		sb2.append("testing");
	}

}
