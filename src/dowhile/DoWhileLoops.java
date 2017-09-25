package dowhile;

public class DoWhileLoops {

	
	/*
	 * CONDITION:
	 * 
	 * Start with a value at 0. Loop while value mod 6 is not equal to 0. Each time through the loop, 
	 * add 1 to the value then print it. The loop must execute at least once. 
	 * 
	 * */
	
	public static void main(String[] args) {
		printUpToModSix();
	}
	
	public static void printUpToModSix() {
		int n = 0;
		do {
			System.out.printf("%d, ", n++);
		}while(n % 6 != 0);
	}
	

}
