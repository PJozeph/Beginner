package beginner;

/*
 * First Java program, which says "Hello, world!"
 */

// Class Hello is the basic unit of a java program.
// {...} is the body of the class.
public class Hello {	
	
	// This is defined so-called main() method, whih is the starting point,
	// or entry point for the program execution
	// {...} is the body of the method which contains programming statement
	public static void main(String args[]) {
		
		// This is used to print the message
		System.out.println("Hello, world!");	// print message
	}

}

/*
* Compile the source code "Hello.java" into portable bytecode "Hello.class",
* using JDK Compiler "javac". Start a CMD Shell: 
* prompt> javac Hello.java
* prompt> java Hello
* Hello, world!
* 
* Take note that the Run command is "java Hello" without the ".class" extensions
* 
*/

/*
* Brief explanation of the Program:
* public class Hell {...}
*/