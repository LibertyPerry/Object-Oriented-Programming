import java.util.Scanner;
import java.util.Date;

public class Exercise13_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the length of side 3: ");
		double side3 = input.nextDouble();
		boolean filled;
		String color = null;
		System.out.print("Is the Triangle filled? (Yes: 1, No: 2) ");
		int fill = input.nextInt();
		if (fill == 1) {
			filled = true;
			System.out.print("Enter Triangle fill color: ");
			color = input.next();
		}else {
			filled = false;
		}
		Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);
		System.out.println();
		System.out.println(triangle1.toString());
		System.out.println("The Area is: " + triangle1.getArea());
		System.out.println("The Perimeter is: " + triangle1.getPerimeter());
		System.out.println("Filled: " + triangle1.isFilled());
		System.out.println("Color: " + triangle1.getColor());
		
	}

}

abstract class GeometricObject{
	private String color = "None";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color; 
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
		
	}
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	public String toString() {
		return "Created on " + dateCreated;
	}
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
	}
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3; 
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3; 
		setColor(color);
		setFilled(filled);
	}
	public double getSide1() {
		return side1; 
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3; 
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double Squareroot = s * (s - side1) * (s - side2) * (s - side3);
		double Area = Math.sqrt(Squareroot);
		return Area;
	}
	public double getPerimeter() {
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}

	
	
}
