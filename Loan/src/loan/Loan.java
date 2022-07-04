package loan;

public class Loan {
    // Private attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    
    // No-arg Constructor
    public Loan() {
        this(2.5, 1, 10000);
    }
    
    // Constructor with argument
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }
    
    // Getter / Accessor Methods
    public double getAnnualInterestRate() { 
        return annualInterestRate; 
    }
    
    public int getNumberOfYears() {
        return numberOfYears;
    }
    
    public double getLoanAmount() {
        return loanAmount;
    }
    
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    
    // Setter / Mutator Methods
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
        public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
        
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    // Other Methods
    public double getTotalPayment() {
        double interestRate;
        double totalPayment;
        
        interestRate = this.loanAmount * (this.annualInterestRate / 100);
        totalPayment = this.loanAmount + interestRate;
        
        return totalPayment;
    }
    
    public double getMonthlyPayment() {
        double interestRate;
        double totalPayment;
        double monthlyPayment;
        
        interestRate = this.loanAmount * (this.annualInterestRate / 100);
        totalPayment = this.loanAmount + interestRate;
        monthlyPayment = totalPayment / (this.numberOfYears * 12);
        
        return monthlyPayment;
    }
    
    
}
