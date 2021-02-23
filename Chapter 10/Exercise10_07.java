import java.util.Date;
import java.util.Scanner;
public class Exercise10_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeat = 0;
		double[] balances = {100, 100, 100, 100, 100, 
				100, 100, 100, 100, 100};
		while (repeat == 0) {
			int id = -1;
			int choice = 0;
			while (id < 0 || id > 9){
				System.out.print("Enter Account ID number: ");
				id = input.nextInt();
			}
			while (choice != 4) {
				Account account = new Account(id, balances[id]);
				System.out.println();
				System.out.println("Main menu");
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("The balance is: " + account.getBalance());
				}
				if (choice == 2) {
					double withdraw = 0;
					System.out.print("Enter Withdraw amount: ");
					withdraw = input.nextDouble();
					account.withdraw(withdraw);
					balances[id] = account.getBalance();
				}
				if (choice == 3) {
					double deposit = 0; 
					System.out.print("Enter Deposit amount: ");
					deposit = input.nextDouble();
					account.deposit(deposit);
					balances[id] = account.getBalance();
				}
				if (choice == 4) {
	
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
		this.balance = id;
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
