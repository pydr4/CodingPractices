package factorial;

/*
 * Task
 *
 *  Write a function to return the factorial of a number.
 *  Solutions can be iterative or recursive.
 *  Support for trapping negative   n   errors is optional. 
 * 
 * 
 * */

public class Factorial {
	public static void main(String[] args) {
		try {
			System.out.printf("%d", factorial(15));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long factorial(int n) throws Exception {
		long factorialNumber=1;
		if(n < 0) {
			throw new Exception("negative numbers are not supported");
		}
		
		while(n > 1) {
			factorialNumber *= n--;
		}
		
		
		return factorialNumber;
		
		
	}

}
