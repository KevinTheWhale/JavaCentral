package Exercise1_1;


public class SavingsAccount{
    public double annualInterestRate = 0.0;
    public double monthlyInterest = 0.0; 
    public double savingsBalance = 0.0;
    public double initialBalance = 0.0;
    
    //Constructor
    // IB = Initial Balance
    protected SavingsAccount(double userIB)
    {
    	initialBalance = userIB;
    }
   
    //Interest Rate 
    protected void modifyInterestRate(double userAIR)
    {
        //AIR = Annual interest rate
        annualInterestRate = userAIR; 
    }     
    
    protected void calculateMonthlyInterest()
    {
        monthlyInterest = ( (initialBalance* (annualInterestRate/100) ) /12);
        savingsBalance = monthlyInterest + initialBalance;

    }    

    //Get Method for savings Balance
    protected double getSavingBalance()
    {
        return savingsBalance;
    }
    

    
    
}
