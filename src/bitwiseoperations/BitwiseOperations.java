package bitwiseoperations;

/*Task
 * Write a routine to perform a bitwise AND, OR, and XOR on two integers, a bitwise NOT on the first integer, a left shift, right shift, right arithmetic shift, left rotate, and right rotate.
 * All shifts and rotates should be done on the first integer with a shift/rotate amount of the second integer.
 * If any operation is not available in your language, note it.
 */

public class BitwiseOperations {
	
	public static void main(String[] args) {
		bitwiseOperation(2, 3);
	}
	
	
	//if 2, 3 is passed in
	/*
	 * 2 AND 3 = 010 AND 011 = 010
	 * 2 OR  3 = 010 OR  011 = 011
	 * 2 XOR 3 = 010 XOR 011 = 001
	 * NOT   2 = NNOT 010    = 101
	 * 2 <<  3 = 010000
	 * 2 >>  3 = 0
	 * 2 >>> 3 = 0
	 * 2 left rotate 3 = 010 -> 1000
	 * */
	
	public static void bitwiseOperation(int a, int b) {
		System.out.println("a AND b: " + (a & b) );
		System.out.println("a OR b: " + (a | b) );
		System.out.println("a XOR b: " + (a ^ b) );
		System.out.println("NOT a: " + ~a );
		System.out.println("a << b: " + (a << b) );
		System.out.println("a >> b: " + (a >> b) );
		System.out.println("a >>> b: " + (a >>> b) );
		System.out.println("a rotate left b: " + Integer.rotateLeft(a, b) );
		System.out.println("a rotate right b: " + Integer.rotateRight(a, b) );
	}

}
