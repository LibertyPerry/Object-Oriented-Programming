import java.util.Scanner;
public class Exercise06_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = " ";
		System.out.print("Enter a password: ");
		s = input.nextLine();
		isValid(s);
		if (isValid(s) == true) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
		}
	}
	public static boolean isValid(String s) {
		int Letter = 0;
		int Digit = 0;
		if (s.length() >= 8){
			for(int x = 0; x < s.length(); x++) {
				char ch = s.charAt(x);
				if(Character.isLetter(ch)){
					Letter += 1;
				}else if (Character.isDigit(ch)) {
					Digit += 1;
				}	
			}
			int totalCh = Letter + Digit;
			if (totalCh == s.length()) {
				if (Digit >= 2) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
			
	}else { 
		return false;
		}
	}
}
