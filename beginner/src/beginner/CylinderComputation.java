package beginner;

/*
 *  Print the surface area and volume of a cylinder, 
 *  given its radius and height in doubles.
 */
public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double surfaceArea, volume;
		double radius, height;
		
		radius = 2.5;
		height = 3.5;
		
		surfaceArea = radius * radius + height;
		volume = radius * height;
		
		System.out.print("The surface area of a cylinder is ");
		System.out.println(surfaceArea);
		System.out.print("The volume of the cylinder is ");
		System.out.println(volume);

	}

}
