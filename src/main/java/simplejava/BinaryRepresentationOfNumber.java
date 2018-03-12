package simplejava;

/**
 * 
 * @author Jitesh
 *
 */
public class BinaryRepresentationOfNumber {

	public static void main(String[] args) {
		String s = bineryReprentaion(156);
		System.out.println("Binary representation of 366 is " + s);
	}

	private static String bineryReprentaion(int i) {
		String s = new String();
		while (i > 0) {
			s = (i % 2) + s;
			i = i / 2;
		}

		return s.toString();
	}

}