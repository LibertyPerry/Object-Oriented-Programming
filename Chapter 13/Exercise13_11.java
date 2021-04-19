
public class Exercise13_11 {
	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(8, "white", true);
		Octagon octagon2 = (Octagon)octagon1.clone();
		System.out.println("Octagon Area: " + octagon1.getArea());
		System.out.println("Perimeter: " + octagon1.getPerimeter());
		
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
class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side = 1.0;
	
	public Octagon() {
	}
	public Octagon(double side) {
		this.side = side;
	}
	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		double s = 2 + (4 / Math.sqrt(2.0));
		double Area = s * side * side;
		return Area;
	}
	public double getPerimeter() {
		double Perimeter = side * 8;
		return Perimeter;
		
	}
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	public int compareTo(Octagon o) {
		if (side > o.side) {
			return 1;
		}else if (side < o.side){
			return -1;
		}else {
			return 0;	
		}
		
	}
	
}




