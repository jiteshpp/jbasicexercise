package simplejavaproblems;

/**
 * 
 * @author Jitesh Pathak
 *
 */
public class BinaryToNumber {
	public static void main(String[] args) {
       String s = "11010101010101010101000011";
		int i = getDecimalNumber(s );
		System.out.println("decimal number is " +i);
				
	}

	private static int getDecimalNumber(String s) {

		
		return Integer.parseInt(s , 2);
	}
}
