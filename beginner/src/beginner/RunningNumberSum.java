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
		int number=lowerbound;
		while (number % 7!=0) {
			sum = sum + number;		// Accumulate number into sum
			++number;				// Next number
			//++number;
		} 
		System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
	}

}


// Modify the above program to sum all the numbers from 9 to 888. (Ans: 394680.)
// Modify the above program to sum all the odd numbers between 1 to 1000. (Hint: Change the post-processing statement to "number = number + 2". Ans: 250000)
// Modify the above program to sum all the numbers between 1 to 1000 that are divisible by 7. (Hint: Modify the initialization and post-processing statements. Ans: 71071.)
// Modify the above program to find the sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +... (Ans: 338350.)
// Modify the above program (called RunningNumberProduct) to compute the product of all the numbers from 1 to 10. (Hint: Use a variable called product instead of sum and initialize product to 1. Ans: 3628800.)
