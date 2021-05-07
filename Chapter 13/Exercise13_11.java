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
			System.out.println("Round Cake Selected");
		}else if (shape == 2) {
			System.out.print("Rectangle Cake Selected");
		}
		double Volume = 0;
		double Circumference = 0;
		double SurfaceArea = 0;
		double Total_Price = 0;
		double Base_Price = 0;
		double Fondant_Price = 0;
		System.out.println();
		System.out.print("How many tiers of cake do you want? ");
		int tiers = input.nextInt();
		String[] Flavors = new String[tiers];
		String[] Icing = new String[tiers];
		// Creating the tiers of cake and adding the prices of each to the total price
		for(int x = 0; tiers > x; x++) {
			System.out.print("Layer " + (x+1) + " Flavor: ");
			String flavor = input.next(); 
			Flavors[x] = flavor;
			
			if (shape == 1) {
				System.out.print("Enter cake demensions\n"
				+ "Diameter: ");
				double diameter = input.nextDouble();
				double radius = diameter / 2;
				System.out.print("Height: ");
				double height = input.nextDouble();
				Cylinder cake = new Cylinder(radius, height);
				Volume = cake.getVolume();
				Circumference = cake.getCircumference();
				SurfaceArea = cake.getSurfaceArea();
					Base_Price = Volume / 4;
					if(Base_Price < 12) {
						Base_Price = 12;
					}
					Total_Price += Base_Price;
			}else if(shape == 2) {
				System.out.print("Enter cake demesion\n"
					+ "Length: ");
				double length = input.nextDouble();
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();
				Rectangle_Prism cake = new Rectangle_Prism(length, width, height);
				Volume = cake.getVolume();
				Circumference = cake.getCircumference();
				SurfaceArea = cake.getSurfaceArea();
					Base_Price = Volume / 6;
					if (Base_Price < 15.00) {
						Base_Price = 15;
					}
					Total_Price += Base_Price;
			}
			
			double icing_type = 0;
			while (icing_type != 1 && icing_type != 2){
			System.out.print("Do you want Butter Cream Icing or Fondant?\n"
					+ "(Foundant costs extra)\n"
					+ "1) Butter Cream, 2)Foundant");
			icing_type = input.nextInt();
			if (icing_type != 1 && icing_type != 2) {
				System.out.println("INCORECT VALUE");
				}
			}
			if (icing_type == 2) {
				Fondant_Price = SurfaceArea * 0.1;
				Total_Price += Fondant_Price;
			}
			System.out.print("Layer " + (x+1) + " Icing color: ");
			String icing = input.next(); 
			Icing[x] = icing;
			System.out.println("Tier Created");
			System.out.println();
		}
		
		System.out.println("Cake Summary:");
		for (int x = 0; x < tiers; x++) {
			System.out.println("Teir " + (x+1) + " Flavor: " + Flavors[x] + ", Icing: " + Icing[x]);
		}
		System.out.println("Order Total for " + name + " is: " + Total_Price);
	
	}
		
}


abstract class Cake {
	private String flavor = " ";
	private String icing = " ";
	
	public Cake() {	
	}
	public Cake(String flavor, String icing) {
		this();
		this.flavor = flavor;
		this.icing = icing;
	}
	public String getFlavor() {
		return flavor;
	}
	public String getIcing() {
		return icing;
	}
	public abstract double getVolume();
	public abstract double getSurfaceArea();
	public abstract double getCircumference();
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
	public double getSurfaceArea() {
		double SurfaceArea = (2 * Math.PI * radius * height) +(Math.PI * radius * radius);
		return SurfaceArea;
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
	public double getCircumference() {
		double Circumference = (length * 2) + (width * 2);
		return Circumference;
	}
	public double getSurfaceArea() {
		double SurfaceArea = (length * width) + (height * length * 2) + (height * width * 2);
		return SurfaceArea;
		
	}
}
class Decorations {
	
}
class Price {
	
}
