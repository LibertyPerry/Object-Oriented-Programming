/*
Author: Libby Perry
Date: January 27, 2021

Sample input/output:
	income = $200.00,   expense = $100.00,  months = 3, savings = $300.00
	income = $200.00,   expense = $100.00,  months = 6, savings = $600.00
	income = $2000.00,  expense = $800.00,  months = 3, savings = $3600.00
	income = $2000.00,  expense = $800.00,  months = 6, savings = $7200.00
*/
import java.util.Scanner;

class Mod1ExamPart1 {
	public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            double income  = 0.0;       // Stores the user's monthly income
            double expense = 0.0;       // Stores the user's monthly expenses
            int months = 0;             // Stores the number of months the user is saving for
            double savings = 0.0;       // Stores the user's calculated savings
            System.out.print("Enter your income for 1 month: $");
            income = input.nextDouble();
            
            System.out.print("Enter your expenses for 1 month: $");
            expense = input.nextDouble();
            
            System.out.print("Enter number of months you are saving: ");
            months = input.nextInt();
            
            // Call method to populate value for savings
            // The call statement is worth 2 pts
            savings(income, expense, months);
            
            System.out.printf("After %d months you will have saved $%.2f", months, savings(income,expense, months));
        }
	// Create your method here
	// The method header is worth 2 pts
	// The method result is worth 3 pts
    // The method should contain a loop calculating savings for each month
    // The loop is worth 3 pts
	public static double savings(double income, double expense, int months) {
		double savings = 0;
		double deposit = income - expense;
		for(int x = 0; x < months; x++) {
			savings += deposit;
		}
		return savings;
	}  
}