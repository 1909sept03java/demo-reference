package com.revature.intro;

public class TestingScopes {

	public static void main(String[] args) {
		VariableScopes obj1 = new VariableScopes();
		VariableScopes obj2 = new VariableScopes();
		
		obj1.myInstanceVar = "iuazhfiu";
		obj1.myStaticVar = "testing";
		
		VariableScopes.myStaticVar = "this is static";
		obj1.myStaticVar = "this does not belong to obj1";
		
		System.out.println(obj2.myStaticVar);
	}
}
