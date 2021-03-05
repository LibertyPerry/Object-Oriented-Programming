import java.util.Scanner;
public class Exercise11_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account Savings = new Account(123, 5000);
		Account Checking = new Account(987, 5000);
		int choice = 0;
		int repeat = 0;
		while (repeat == 0) {
		while (choice != 1 && choice != 2) {
		System.out.print("Chose account to deposit or withdraw "
				+ "\n(Checking Account 1, Savings Account 2) : ");
		choice = input.nextInt();
		}
		if (choice == 1) {
			int choice2 = 0;
		while (choice2 != 4) {
			System.out.println();
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			System.out.print("Enter a choice: ");
			choice2 = input.nextInt();
			if (choice2 == 1) {
				System.out.println("The balance is: " + Checking.getBalance());
			}
			if (choice2 == 2) {
				double withdraw = 0;
				System.out.print("Enter Withdraw amount: ");
				withdraw = input.nextDouble();
				CheckingAccount checking1 = new CheckingAccount(withdraw);
				if (checking1.overdraftLimit() == true) {
					Checking.withdraw(withdraw);
				}else if (checking1.overdraftLimit() == false) {
					System.out.println(checking1.toString());
				}
			}
			if (choice2 == 3) {
				double deposit = 0; 
				System.out.print("Enter Deposit amount: ");
				deposit = input.nextDouble();
				Checking.deposit(deposit);
			}
			if (choice2 == 4) {
				System.out.println();
				choice = 0;
			}
		}
		}
		else if (choice == 2) {
			int choice2 = 0;
			while (choice2 != 4) {
				System.out.println();
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.print("Enter a choice: ");
				choice2 = input.nextInt();
				if (choice2 == 1) {
					System.out.println("The balance is: " + Savings.getBalance());
				}
				if (choice2 == 2) {
					double withdraw = 0;
					System.out.print("Enter Withdraw amount: ");
					withdraw = input.nextDouble();
					SavingsAccount savings1 = new SavingsAccount(withdraw);
					Savings.withdraw(withdraw);
					System.out.println(savings1.toString());
				}
				if (choice2 == 3) {
					double deposit = 0; 
					System.out.print("Enter Deposit amount: ");	
					deposit = input.nextDouble();
					Savings.deposit(deposit);
				}
				if (choice2 == 4) {
					System.out.println();
					choice = 0;
				}
			}
		}
		}
	}

}
class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance; 
	}
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getDateCreated(){
		return this.dateCreated.toString();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();

	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
}
class CheckingAccount extends Account {
	private final double overdraft = 1000;
	public double withdraw;
	CheckingAccount(){
	}
	CheckingAccount(double withdraw){
		this();
		this.withdraw = withdraw;
	}
	public double getWithdraw() {
		return this.withdraw;
	}
	public boolean overdraftLimit() {
		if (withdraw >= overdraft) {
			return false;
		}else {
		return true;
		}
	}
	public String toString(){
		return "Withdraw amount exceeds overdraft limit.";
	}
}
class SavingsAccount extends Account {
	public double withdraw;
	SavingsAccount(){	
	}
	SavingsAccount(double withdraw){
		this();
		this.withdraw = withdraw;
	}
	public String toString() {
		return "Withdraw Succussful";
	}
}




