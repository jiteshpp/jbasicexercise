/**
 * 
 */
package solidprinciples.openend.openendsolution;

/**
 * @author Jitesh Pathak
 *@date - 03/12/2018
 */
public class DivisionClass implements OperationsInterface {

	/* (non-Javadoc)
	 * @see solidprinciples.singlerepo.solution.OperationsInterface#doOperations(int, int)
	 */
	public void doOperations(int a, int b) {

		if (a>b)
		{
			System.out.println("Division is " +(a/b));
		}
		else
			System.out.println("Division is " +(b/a));
	}

}
