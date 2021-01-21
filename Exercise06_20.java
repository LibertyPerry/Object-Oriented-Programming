import java.util.Scanner;
public class Exercise06_20 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String s = " ";
		System.out.print("Enter a string: ");
		s = input.nextLine();
		System.out.println("'" + s + "' is " + s.length() + " characters long.");
		countLetters(s);
		System.out.println("There are " + countLetters(s) + " letters in '" + s + "'");

	}
	public static int countLetters(String s) {
		int countLetters = 0;
		for(int x = 0; x < s.length(); x++) {
			char test = s.charAt(x);
			boolean letter = Character.isLetter(test);
			if (letter == true) {
				countLetters += 1;
			}	
		}
		return countLetters;
	}
}
