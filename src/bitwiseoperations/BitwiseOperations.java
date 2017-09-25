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
