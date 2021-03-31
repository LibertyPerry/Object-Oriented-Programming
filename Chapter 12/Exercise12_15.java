import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
			
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] number = new int[100];
		for (int x = 0; x < 100; x++) {
			number[x] = (int) (Math.random() * 100);
			numbers.add(number[x]);
		}
		Collections.sort(numbers);
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		for (int x = 0; x < 100; x++) {
		output.print(numbers);
		output.print(" ");
		}
		output.close();
		
		
		
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String Number = input.next();
			System.out.print(Number + " ");
			} 
			input.close();

	}

}
