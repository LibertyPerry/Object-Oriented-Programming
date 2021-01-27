
public class Exercise09_01 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The Area of a rectangle with " + rectangle1.width + " width and " + rectangle1.height + " height is " + rectangle1.getArea());
		System.out.println("The Perimeter of this rectangle is " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The Area of a rectangle with " + rectangle2.width + " width and " + rectangle2.height + " height is " + rectangle2.getArea());
		System.out.println("The Perimeter of this rectangle is " + rectangle2.getPerimeter());
	}

}
class Rectangle {
	double width;
	double height;
	Rectangle() {
		width = 1;
		height = 1;
	}
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return (width + height) * 2;
	}
	void setWidth(double newWidth) {
		width = newWidth;
	}
	void setHeight(double newHeight) {
		height = newHeight;
	}
}

