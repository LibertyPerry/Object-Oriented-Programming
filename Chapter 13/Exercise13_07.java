
public class Exercise13_07 {
	public static void main(String[] args) {
		
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
class Colorable{
	String howToColor;
}
}
