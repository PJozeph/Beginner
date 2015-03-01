package beginner;

/*
 * Print the area and perimeter of a rectangle, 
 * given its length and width in doubles
 */
public class RectangleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area, perimeter;
		double length, width;
		
		length = 1.5;
		width = 2.5;
		
		perimeter = length * 2.0 + width * 2.0;
		area = width * length;
		
		System.out.print("The area of rectangle is ");
		System.out.println(area);
		System.out.print("The perimeter of rectangle is ");
		System.out.println(perimeter);

	}

}
