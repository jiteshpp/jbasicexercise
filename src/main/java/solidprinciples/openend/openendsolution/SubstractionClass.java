package solidprinciples.openend.openendsolution;
/**
 * 
 * @author Jitesh
 * @date - 03/12/2018
 */
public class SubstractionClass  implements OperationsInterface{

	public void doOperations(int a, int b) {
		if (a>b)
		{
			System.out.println("Substraction is " +(a-b));
		}
		else
			System.out.println("Substraction is " +(b-a));
	}

}
