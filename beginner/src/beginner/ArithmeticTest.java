package beginner;

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 98;			// Declare an int variable number1 and initialize it to 98
		int number2 = 5;			// Declare an int variable number2 and initialize it to 5
		int sum, difference, product, quotient, remainder;		// Declare five int variables to hold result
		int number3 = 77;
		
		// Perform arithmetic Operations
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		difference = number1 - number2;
		quotient = number1  / number2;
		remainder = number1 % number2;
		
		// Print results
		System.out.println("The sum, difference, product, quotient and remainder of " + number1 + ", " + number2 + " and " + number3 + " are " + sum +
				", " + difference + ", " + product + ", " + quotient + ", and " + remainder + ".");	// Print description
		//System.out.print(number1);	// Print the value of the variable
		//System.out.print(" and ");
		//System.out.print(number2);
		//System.out.print(" are ");
		//System.out.print(sum);
		//System.out.print(", ");
		//System.out.print(difference);
		//System.out.print(", ");
		//System.out.print(product);
		//System.out.print(", ");
		//System.out.print(quotient);
		//System.out.print(", and ");
		//System.out.println(remainder);
		
		++number1;		// Increment the value stored in the variable "number1" by 1
						// Same as "number1 = number1 + 1"
		--number2;		// Decrement the value stored in the variable "number2" by 1
						// Same as "number2 = number2 -1"
		System.out.println("number1 after increment is " + number1);	// Print description and variable
		System.out.println("number2 after decrement is " + number2);
		quotient = number1 / number2;
		System.out.println("The new quotiont of " + number1 +  " and " + number2
				+ " is " + quotient);

	}

}
