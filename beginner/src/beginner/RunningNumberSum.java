package beginner;

/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */
public class RunningNumberSum {
	public static void main(String args []) {
		
		int lowerbound = 1;		// store the lowerbound
		int upperbound = 1000;	// store the upperbound
		int sum = 0;			// declare an int variable "sum" to accumulate the numbers
								// Set  the initial sum to 0
		
		// use a while loop to  repeatitively sum from  the lowerbound to the upperbound 
		int number = lowerbound;
		//number = number +2;
		
		// zero:		
		while (number <= upperbound) {
			sum=+number;
			++number;
		}
		 	
	
		
		
		
		System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
	}

}




