import java.util.Scanner;

public class Exercise12_03 { 
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int x = 0; x < 100; x++) {
			numbers[x] = (int) (Math.random() * 100);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number index to check value: ");
		int value = input.nextInt();
		if (value < 0 || value > 99) {
			System.out.println("Out of Bounds");
		} else {
			value = value - 1;
			System.out.println(numbers[value]);
		}
}
}
