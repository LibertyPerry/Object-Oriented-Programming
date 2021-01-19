import java.util.Scanner;
public class Exercise06_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the 3 sides of the trangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		isValid(side1, side2, side3);
		if(isValid(side1, side2, side3) == true) {
			area(side1, side2, side3);
			System.out.println("Side 1: " + side1);
			System.out.println("Side 2: " + side2);
			System.out.println("Side 3: " + side3);
			System.out.printf("Area: %4.1f", area(side1, side2, side3));
		}else {
			System.out.println("That is not a valid triangle");
		}
	}
	/** Return true if the sum of every two sides is greater than the third side.*/
	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3) {
			return true;	
		}else {
			return false;
		}
	}

	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double x = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.sqrt(x);
		return area;
	}
}
