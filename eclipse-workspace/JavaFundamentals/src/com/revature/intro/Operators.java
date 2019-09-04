package com.revature.intro;

public class Operators {

	/*
	 * An operator in Java is a special symbol that can 
	 * be applied to a set of variables, values, or literals -
	 * referred to as operands - and that returns a result
	 * 
	 * There unary, binary, and ternary operators, with 1, 
	 * 2, and 3 operands, respectively
	 */
	
	public static void main(String[] args) {
		System.out.println(12 | 25);
	}
	
	//---------------UNARY OPERATORS---------------------------
	
	//increment/decrement operators
	static void postIncrement(int count) {
		if(++count == 5) System.out.println("true"); 
		System.out.println(count);
	}
	
	static boolean preIncrement(int count) {
		return ++count == 5;
	}
	
	static void decrement(int count) {
		--count; //pre
		count--; //post
	}
	
	static void testUnary(int count) {
		if(count++<5) {
			System.out.println(count);
		}
	}
	
	//THEN
	//Two's complement ==> n = -(n+1)
	static int complement(int x) {
		return ~x;
	}
	
	//THEN from left to right
		static int negate(int x) {
			return -x;
		}
		
		static boolean opposite(boolean exp) {
			return !exp;
		}
		
		static int positive(int x) {
			return +x; //doesnt really do anything, but its a thing
		}
	
		//NEXT, BINARY, from left to right first  *, /, % then + , -
 		static void binary(int a, int b) {
			int x = a + b;
			x = a - b;
			x = a / b;
			x = a * b;
			x = a % b; //MODULUS, gives remainder from division
		}
 		

 		//THEN BITSHIFT
 		// >> << >>>
 		
 		/*
 		 * Signed Left Shift
 		 * Shifts a bit pattern(left operand) by a certain number(right
 		 * operand) of bits to the left(add 0 to end)
 		 * 
 		 * 212      =  11010100
 		 * 212 << 1 = 110101000 = 424
 		 * 212 >> 2 =  00110101
 		 */
 		static int leftShift(int num, int shift) {
 			return num << shift;
 		}
 		
 		//THEN RELATIONAL > < >= <= instanceof 
 		static boolean relational(Object obj) {
 			if(obj instanceof String) return true;
 			else return false;
 		}
 		
 		//THEN Equals
 		public boolean equalTo(int a, int b) {
 			if(a == b ) return true;
 			else if(a != b) return false;
 			else return false;
 		}
 		
 		/*BITWISE &, |, ^
 			these operators compare the corresponding bits of 
 			the operands. 
 			
 			ex
 			
 			 12  -> 001100 |
 	 		|25  -> 011001
 	 			  = 011101  = 29
 	 		
 		*/
 		static int bitwiseOr(int a, int b) {
 			return a | b;
 		}
 		
 		static void ifstatement() {
 			int x = 10;
 			if(x < 5  &&  x++ > 25) System.out.println("true");
 		}
 		
 		//SHORT CIRCUIT
 		
 		public String shortCircuit(boolean first, boolean second) {

 			//if(x++ == 5 && --y == x)
 			if(first && second) {
 				return "if first is false, the second operand isn't valuated"
 						+ "because there is no way that the entire expression "
 						+ "can be true regardless of whether or not the second"
 						+ "operand is true";
 			}
 			else if(first || second) {
 				return "if first is true, the expression is automatically true"
 						+ "regardless of value of second, so second is not "
 						+ "evaluated. if first is false, truthiness of entire"
 						+ "expression depends on second, so it is evaluated.";
 			}
 			else return "both are false";
 		}
 		
 		
 		//////////////////////////
 		
 		// TERNARY OPERATORS
 		// 3 operands
 		// [expression] ? [val for T] : [val for F]
 		static String ternary(int x) {
 			return x > 0 ? "X is greater than 0" : "X is less than 0";
 		}	
}
