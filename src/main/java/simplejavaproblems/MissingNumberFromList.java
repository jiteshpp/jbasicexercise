package simplejavaproblems;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Jitesh 
 * This class can be used to find one missing number from arraylist 
 */
public class MissingNumberFromList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(); 
		
		for (int i = 0 ; i<=100; i++)
		{
			numbers.add(i);
		}
		numbers.remove(45);
		
		
		int result = (numbers.size()*(numbers.size()+1))/2;
		int result1= 0;
		for (int j : numbers)
		{
			result1= result1+j;
		}
		int missingnumber=result-result1;
		System.out.println(missingnumber);
		
	}

}
