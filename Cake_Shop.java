import java.util.Scanner;

public class Cake_Shop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Cake Shop");
		System.out.print("Enter name for order: ");
		String name = input.next();
		double shape = 0;
		while (shape != 1 && shape != 2){
			System.out.print("Would you like a Round or a Rectangle cake? \n"
					+ "(1 Round, 2 Rectangle) :" );
			shape = input.nextDouble();
			if (shape != 1 && shape != 2) {
				System.out.println("INCORECT VALUE");
			}
		}
		if (shape == 1) {
			System.out.print("Round Cake Selected\n"
					+ "Enter cake demensions\n"
					+ "Diameter: ");
			double diameter = input.nextDouble();
			double radius = diameter / 2;
			System.out.print("Height: ");
			double height = input.nextDouble();
		}else if (shape == 2) {
			
			
		}

	}

}
class Cake {
	
}
class Cylinder extends Cake {
	private double radius; 
	private double height;

	public Cylinder() {
	}
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius() {
		radius = radius;
	}
	public void setHeight() {
		height = height;
	}
	public double getVolume() {
		double base = Math.PI * (radius * radius);
		double volume = base * height;
		return volume;
	}
	public double getCircumference() {
		double Circumference = 2 * Math.PI * radius;
		return Circumference;
	}
	public double TrueSA() {
		double TrueSA = (2 * Math.PI * radius * height) +(Math.PI * radius * radius);
		return TrueSA;
	}
}
class Rectangle_Prism extends Cake {
	private double length;
	private double width;
	private double height;
	
	public Rectangle_Prism() {
	}
	public Rectangle_Prism(double length, double width, double height) {
		this.length = length;
		this.width = width; 
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setLength() {
		length = length;
	}
	public void setWidth() {
		width = width;
	}
	public void setHeight() {
		height = height;
	}
	public double getVolume() {
		double volume = length * width * height;
		return volume;
	}
	public double getPerimeter() {
		double perimeter = (length * width) + (height * length * 2) + (height * width * 2);
		return perimeter;
	}
}
class Decorations {
	
}
class Price {
	
}

