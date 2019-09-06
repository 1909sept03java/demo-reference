package com.revature.collections;

import java.util.ArrayList;

public class UnderstandingCollections {
	
	/*
	 * In Java, a Collection is a group of individual 
	 * objects represented as a single unit. 
	 * We use them to store and organize our groups of
	 * objects. 
	 * Java's Collection interface is extended by 3 major
	 * interfaces: List, Set, and Queue. 
	 * Also associated with Collections are Maps, which 
	 * hold Key, Value pairs 
	 */
	
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(5);
		myList.add("helloWorld");
		myList.add(new Object());
		
	//	int x = myList.get(0);
		
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		myNums.add(5);
	//	myNums.add("afojaifj");
		
		ArrayList<Object> myObjs = new ArrayList<Object>();
		myObjs.add(new Integer(5));
		myObjs.add(new String("aiufhiauh"));
		
		Object curr = myObjs.get(0);
		String str = (String) curr;
		System.out.println(str.length());
	}

}
