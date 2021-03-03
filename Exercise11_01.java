import java.util.Scanner;
import java.util.Date;
public class Exercise11_01 {
	public static void main(String[] args) {
		boolean filled;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter length of side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter length of side 3: ");
		double side3 = input.nextDouble();
		System.out.print("Enter Triangle fill color: ");
		String color = input.next();
		System.out.print("Is Trinangle filled? (Yes: 1, No: 2): ");
		int fill = input.nextInt();
		if (fill == 1) {
			filled = true;
		}else { 
			filled = false;
		}
		GeometricObject object1 = new GeometricObject(color, filled);
		Triangle triangle1 = new Triangle(side1, side2, side3);
		System.out.println();
		System.out.println("Created " + triangle1.toString());
		System.out.println("The Area is: " + triangle1.getArea());
		System.out.println("The Perimeter is: " + triangle1.getPerimeter());
		System.out.println(object1.toString());
	}

}
class GeometricObject {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	GeometricObject() { 
		dateCreated = new java.util.Date();
	}
	GeometricObject(String color, boolean filled){
		this();
		this.color = color;
		this.filled = filled;
	}
	String getColor(){
		return color; 
	}
	void setColor(String color) {
		this.color = color; 
	}
	boolean isFilled() {
		return filled;
	}
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getDateCreated(){
		return this.dateCreated.toString();
	}
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
}
class Triangle extends GeometricObject { 
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	Triangle(){
	}
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	double getSide3() {
		return side3;
	}
	double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double Squareroot = s * (s - side1) * (s - side2) * (s - side3);
		double Area = Math.sqrt(Squareroot);
		return Area;
	}
	double getPerimeter() {
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}







