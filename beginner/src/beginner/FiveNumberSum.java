package beginner;

/*
 * Sum five numbers and print the result
 */
public class FiveNumberSum {
	public static void main(String args []) {
		
		int number1 = 11;	// Declare 5 int variables to hold 5 integers
		int number2 = 22;
		int number3 = 33;
		int number4 = 44;
		int number5 = 55;
		int sum;			// Declare an int variable called sum to hold the sum
		sum = number1 + number2 + number3 + number4 + number5;
		System.out.print("The sum is ");	// Print a descriptive string
		System.out.println(sum);			// Print the value stored in sum
	}
}

/* 
* We declare five int (integer) variables called number1, number2, number3, number4, and number5; 
* and assign values of 11, 22, 33, 44 and 55 to the variables, respectively, 
* via the so-called assignment operator '='. 
* 
* You could also declare many variables in one statement, separating with commas, e.g.,
* int number1 = 11, number2 = 22, number3 = 33, number4 = 44, number5 = 55;
*/

/*
* int sum;
* declares an int (integer) variable called sum, without assigning an initial value.
*/

/*
* sum = number1 + number2 + number3 + number4 + number5;
* computes the sum of number1 to number5 and assign the result to the variable sum. 
* The symbol '+' denotes arithmetic addition, just like Mathematics.
*/

/*
* System.out.print("The sum is ");
* System.out.println(sum);
* 
* Line 16 prints a descriptive string. 
* A String is surrounded by double quotes, and will be printed as it is (but without the double quotes). 
* Line 17 prints the value stored in the variable sum (in this case, the sum of the five numbers). 
* You should not surround a variable to be printed by double quotes; otherwise, 
* the text will get printed instead of the value stored in the variable.
*/