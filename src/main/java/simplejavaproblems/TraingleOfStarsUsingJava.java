package simplejavaproblems;
/**
 * 
 * @author Jitesh 
 *
 */
public class TraingleOfStarsUsingJava {
	public static void main(String[] args) {
		int n=5;  // number of rows 
        int k = 2*n - 2; 
  
       
        for (int i=0; i<n; i++)
        {
 
           // This one is to handle number of spaces and print the spaces
            for (int j=0; j<k; j++)
            {
                
                System.out.print(" ");
            }
  
            
            k = k - 1;
  
           // handles the columns and prints the number of stars
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }
	}
}
