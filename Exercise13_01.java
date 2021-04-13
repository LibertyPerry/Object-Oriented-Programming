
public class Exercise13_01 {
	public static void main(String[] args) {
		
	}

}

abstract class GeometricObject{
	private String color = "White";
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
		return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
class Triangle extends GeometricObject{
	private double side1 = 0;
	
}

