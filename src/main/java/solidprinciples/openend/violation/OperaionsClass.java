package solidprinciples.openend.violation;

/**
 * 
 * @author Jitesh
 * @date - 03/12/2018
 *
 */
public class OperaionsClass {

	public void doOperations(Operations operations, int i, int j) {
		switch (operations) {
		case ADDITION:
			System.out.println(i + j);
			break;
		case SUBSTRACTION:
			System.out.println(i - j);
			break;
		case MULTIPLICATION:
			System.out.println(i * j);
			break;
		case DIVISION:
			System.out.println(i / j);
			break;
		default:
			System.out.println("Please so nothing");
			break;
		}

	}
}
