package solidprinciples.openend.openendsolution;
/**
 * 
 * @author Jitesh
 * @date - 03/12/2018
 */
public class OpenEndOperations {

	public static void main(String[] args) {
		OperationsInterface operationsInterface = new AdditionClass();
		operationsInterface.doOperations(12, 15);
		// Now if we are willing to add some another operation then just add the class and implement the OperationsInterface interface
	}
}
