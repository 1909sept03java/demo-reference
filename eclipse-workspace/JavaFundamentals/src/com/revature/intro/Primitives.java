package com.revature.intro;

public class Primitives {

	int i; // 4 bytes 
	boolean b; // t or f
	char ch; // single character values held in ''
	double d; // decimal values 8 bytes 
	long l; // whole number values - 8 bytes 
	float f; // doubles but smaller but more precision - 4 bytes 
	short s; //  2 bytes
	byte byt; // 8 bits

	public static void main(String[] args) {
		casting();
	}

	static void numberBases() {
		int dec = 10;
		System.out.println(dec);

		//BINARY (base 2; vals 0-1; 0B or 0b to preface digits)
		int binary = 0B1011110;
		System.out.println(binary);

		//OCTAL (base 8; 0-7; preface digits with 0);
		int octal = 010;
		System.out.println(octal);

		//HEX (base 16; 0-9, a-f)
		int hex = 0xa314f;
		System.out.println(hex);

		System.out.println( octal * 2);

	}


	static void numberFormatting() {
		int largeNum = 1_000_000;
		//	int wrong = _1_;
		double rightDouble = 102.31_94;
		//	double wrongDouble = 102_.3194;

		long max = 21474836470L;
	}


	static void casting() {
		/*
		 * Casting is the process of making a variable 
		 * behave as a variable of another type
		 * We can cast between primitives of the same 
		 * literal type or objects on the same inheritance tree
		 * We can either explicitly cast or implicitly cast
		 */

		int x = 32767; //max value for short is 32767
		long lon = x; //implicitly casting into a larger reference type
		short sh = (short) x; //must explicitly cast into smaller type
		System.out.println(sh);
	}

}
