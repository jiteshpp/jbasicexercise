/**
 * 
 */
package solidprinciples.openend.openendsolution;

/**
 * @author Jitesh Pathak
 *@date - 03/12/2018
 */
public class MultiplicationClass implements OperationsInterface {

	/* (non-Javadoc)
	 * @see solidprinciples.singlerepo.solution.OperationsInterface#doOperations(int, int)
	 */
	public void doOperations(int a, int b) {
		System.out.println("Multiplication  is " +(a*b));
	}

}
