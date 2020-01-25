/*
 * SELECTION SORT ANALYSIS 
 * LOOKING AT THE RUN TIME OF SELCTION SORT
 * 
 * @author: Leo Garcia
 * 
 */

package Testing;

public class selectionSort {
	public static void selectionSortAlg(int[] vals) {
	
		int indexMin;
		
		//Outer loop runs n times
		for (int i = 0; i < vals.length; i ++) {
			
			// this is constant time operation O(1)
			indexMin = i; 
			
			//inner loop runs n - i times 
			for (int j=i+1; j< vals.length; j++) {
				
				//this is a constant time operation O(1)
				//conditional and value assigning is two
				//statements
				if (vals[j] < vals[indexMin]) {
					indexMin = j;
				}
			}
			
			//this is a constant time operation O(1), WHY??
			//because method only takes 3 statements
			// to swap the numbers, look at method below
			swap(vals, indexMin, i);
		}
		//the tightest bound for this entire piece of code is 
		// O(n), outer loop * O(n-i), inner loop
		// n * n is n^2 or n squared the i can be dropped since the n squared
		// is the dominant term
		//selection sort run time is O(n^2) or big O of n squared, quadratic time
	}

	private static void swap(int[] vals, int indexMin, int i) {
		// TODO Auto-generated method stub
		int temp = vals[indexMin];
		vals[indexMin] = vals[i];
		vals[i] = temp;
		
	}
}
