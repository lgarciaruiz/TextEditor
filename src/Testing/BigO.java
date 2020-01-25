package Testing;
public class BigO {
// RUN TIME FOR ALGORITHM WITH CONSECUTIVE OPERATIONS, FOR LOOPS
//this code reduces all values in the array by the smallest value in the array
	public static void reduce (int[] vals) {
		//**BEGIN FIRST OPERATION**\\ 
		  int minIndex =0; // <-- run time of this operation is O(1), Big O of 1
		//**END FIRST OPERATION**\\
		  
		//**BEGIN SECOND OPERATION**\\
		  for (int i=0; i < vals.length; i++) {
		    if (vals[i] < vals[minIndex] ) { // second operations is O(n), n being the number of items in array
		      minIndex = i;
		    }
		  }
		//**END SECOND OPERATION**\\
		  
		//**BEGIN THIRD OPERATION**\\
		  int minVal = vals[minIndex]; // <-- third operation is O(1)
		//**END THIRD OPERATION**\\
		
		  //**BEGIN FOURTH OPERATION**\\
		  for (int i=0; i < vals.length; i++) { // fourth operation is O(n)
		    vals[i] = vals[i] - minVal;
		  }
		  //**END FOURTH OPERATION**\\
		  
		  //run time for this algorithm is O(1) + O(n) + O(1) + O(n)
		  // or 1 + n + 1 + n = 2n + 2 you have to drop constants and keep dominant terms
		  // answer is n so run time of this algorithm is O(n).
	
	}
	
	
// RUN TIME FOR ALGORITHM WITH NESTED FOR LOOPS FOCUS
	//start from the inside out
	//returns the max difference between all integers in the array
	  public static int maxDifference (int[] vals) {
		  //**BEGIN FIRST OPERATION**\\ <-- O(1)
		  int max = 0;
		  //**END FIRST OPERATION**\\
		  
		  //**BEGIN SECOND OPERATION**\\
		  for (int i=0; i < vals.length; i++) { // <-- O(n^2), iterating through n elements and for each element iterating n times
		    //**BEGIN THIRD OPERATION**\\ <-- O(n)
		    for (int j=0; j < vals.length; j++) {
		      //**BEGIN FOURTH OPERATION**\\ <-- O(1)
		      if (vals[i] - vals[j] > max) {
		        max = vals[i] - vals[j];
		      }
		      //**END FOURTH OPERATION**\\
		    }
		    //**END THIRD OPERATION**\\
		  } 
		  //**END SECOND OPERATION**\\
		  
		  //**BEGIN FIFTH OPERATION**\\ <-- O(1)
		  return max;
		  //**END FIFTH OPERATION**\\
		}
	  
	  //WITH NESTED FOR LOOPS WE ARE MULTIPLYING TIMES THE OUTER FOR LOOP
	  //SINCE WE ONLY CARE ABOUT THE DOMINANT RUN TIME IT DOESNT MATTER IF 
	  //WE ADD ALL THESE STEPS TOGETHER THE DOMINANT TIME HERE IS O(N2) --> N SQUARED OR
	  //QUADRATIC RUN TIME
	  
	  
	  //Remember, Big-O only applies as n gets larger. 
	  //When n is small, both O(n^2), n squared or O(n) could use fewer operations.

	  
	  //multiply the three run times to find tightest bound
	  //the three run times are (2*n)(1000)(n/2) = n^2
	  //run time for this is n squared
	  for (int i=0; i<2*n; i++) { // this runs 2n
		  for (int j=n-1000; j<n; j++) { // this runs constant because 
			  //your running only 1000 times less than n
		    for (int k=n/2; k<n; k++ ) { // run times for this is n/2
		      //sum is a variable declared and initialized elsewhere
		      sum++;
		    }
		  }
		}
	
}
