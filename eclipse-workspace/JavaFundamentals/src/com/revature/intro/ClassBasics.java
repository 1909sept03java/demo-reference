/*
 * the package is always the FIRST line of a Java class (outside of comments)
 * 
 * Java is a package-centric language - every class you make should be in an 
 * appropriately named package. 
 * This is how we keep our code organized 
 * 
 * com.revature.intro.sub is NOT considered to be a "subpackage" of 
 * com.revature.intro when we do things like import with *, it is its
 * own package
 */
package com.revature.intro;

import java.util.Arrays;

//HERE is where we list all of our imports, but what is an import?

public class ClassBasics {
	
	//here is where instance and static variables typically go
	private String aboutMe;
	
	// no arg constructor! still implicitly calls super()
	ClassBasics(){}
	
	public ClassBasics(String aboutMe) {
		super();
		this.aboutMe = aboutMe;
	}

	
	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public static void main(String[] args) {
		/*
		 * in order to use instance fields inside of static methods,
		 * we must instantiate the class within itself  
		 */
		ClassBasics basics = new ClassBasics();
		basics.learnJava();
	}
	
	static void sortNums( int... nums) {
		Arrays.sort(nums);
	}
	
	void doThings() {
		learnJava();
	}
	
	void learnJava() {
		sortNums();
		sortNums(100, 31, 35, 124, 46, 342354);
		sortNums(1, 2, 4, 5, 6);
	}
	

}

class AnotherClass {
	//just here to show we can have more than one class in a file
	//but only ONE can be public 
}