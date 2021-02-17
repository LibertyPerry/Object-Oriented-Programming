public class Exercise10_03 {
	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(6);
		MyInteger num2 = new MyInteger(18);
		System.out.printf("Is %d Even? %s%n", num1.Revalue(), num1.isEven());
		System.out.printf("Is %d Odd? %s%n", num1.Revalue(), num1.isOdd());
		System.out.printf("Is %d Prime? %s%n", num1.Revalue(), num1.isPrime());
		
		System.out.printf("Is 23 Even? %s%n", MyInteger.isEven(23));
		System.out.printf("Is 23 Odd? %s%n", MyInteger.isOdd(23));
		System.out.printf("Is 23 Prime? %s%n", MyInteger.isPrime(23));
		
		System.out.printf("Is %d Equal to %d? %s%n", num1.Revalue(), num2.Revalue(), num1.equals(num2));
		System.out.printf("Is %d Equal to 18? %s%n", num2.Revalue(), num2.equals(18));
		
		System.out.printf("The sum of 1, 7, & 9 is: %d%n", MyInteger.parseInt(new char[] {'1', '7', '9'}));
		System.out.printf("%d%n", MyInteger.parseInt("1234"));
	}
}
class MyInteger{
	private int value = 0; 
	public MyInteger() {
	}
	MyInteger(int value){
		this.value = value;
	}
	public int Revalue(){
		return value;
	}
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}else {
		return false;
		}
	}
	boolean isOdd() {
		if(value % 2 == 1) {
			return true;
		}else {
		return false;	
		}
	}
	boolean isPrime() {
		if(value == 1 || value == 2) {
			return true;
		}else {
			for(int x = 2; x < value; x++) {
				if(value % x == 0) {
					return false;
				}
			}
		}return true;
		
	}
	public static boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isOdd(int value) {
		if(value % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isPrime(int value) {
		if (value == 1 || value == 2) {
			return true;
		}else {
			for (int x = 2; x < value; x++) {
				if (value % x == 0) {
					return false;
				}
			}
		}return true; 
		
	}
	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	public boolean equals(int testvalue) {
		if (value == testvalue) {
			return true;
		}else {
		return false;
		}
	}
	public boolean equals(MyInteger testvalue) {
		if (testvalue.value == this.value) {
			return true;
		}else {
		return false;
		}
	}
	public static int parseInt(char[] values) {
		int sum = 0;
		for (char i : values) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}

}
