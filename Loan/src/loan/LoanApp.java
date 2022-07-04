package loan;

// To use scanner library to retrieve user input
import java.util.Scanner;

public class LoanApp {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Declaring variables to receive user input
        double loanAmt;
        int year;
        
        // Prompting user for values
        System.out.print("How much loan do you want to take? ");
        loanAmt = input.nextDouble();
        
        System.out.print("Duration of loan (in years)? ");
        year = input.nextInt();
        
        // Create object loan based on user input
        Loan loan1 = new Loan(2.5, year, loanAmt);
        
        System.out.println("Total Payment: " + loan1.getTotalPayment());
        System.out.println("Monthly Payment: " + loan1.getMonthlyPayment());
    }
}
