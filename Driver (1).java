package Exercise1_1;

import java.text.DecimalFormat;

public class Driver{
	
    public static void main(String args[]){
    	
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
    	
  
        //Instance
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00); 

		
        System.out.print("\n\t===Server 1===");
        
		//Interest Rate is 4
        saver1.modifyInterestRate(4);        
        //Calculate Interest
        saver1.calculateMonthlyInterest();
        System.out.print("\nThe Monthly Interest is : " + (saver1.annualInterestRate) + " %\n");
        System.out.print("The Initial Balance is : $" + (saver1.initialBalance) + "\n");
        System.out.print("The Monthly interest is : $" + df.format((saver1.monthlyInterest)) + "\n");
        System.out.print("The Total Saving is : $" + df.format((saver1.getSavingBalance())) + "\n");
        
		//Interest Rate is 5
        saver1.modifyInterestRate(5);  
        //Calculate Interest
        saver1.calculateMonthlyInterest();
        System.out.print("\nThe Monthly Interest is : " + (saver1.annualInterestRate) + " %\n");
        System.out.print("The Initial Balance is : $" + (saver1.initialBalance) + "\n");
        System.out.print("The Monthly interest is : $" + df.format((saver1.monthlyInterest)) + "\n");
        System.out.print("The Total Saving is : $" + df.format((saver1.getSavingBalance())) + "\n");    
        
        
        System.out.print("\n\n\n\t===Server 2===");
        
		//Interest Rate is 4
        saver2.modifyInterestRate(4);        
        //Calculate Interest
        saver2.calculateMonthlyInterest();
        System.out.print("\nThe Monthly Interest is : " + (saver2.annualInterestRate) + " %\n");
        System.out.print("The Initial Balance is : $" + (saver2.initialBalance) + "\n");
        System.out.print("The Monthly interest is : $" + df.format((saver2.monthlyInterest)) + "\n");
        System.out.print("The Total Saving is : $" + df.format((saver2.getSavingBalance())) + "\n");
          
  		//Interest Rate is 5
        saver2.modifyInterestRate(5);  
        //Calculate Interest
        saver2.calculateMonthlyInterest();
        System.out.print("\nThe Monthly Interest is : " + (saver2.annualInterestRate) + " %\n");
        System.out.print("The Initial Balance is : $" + (saver2.initialBalance) + "\n");
        System.out.print("The Monthly interest is : $" + df.format((saver2.monthlyInterest)) + "\n");
        System.out.print("The Total Saving is : $" + df.format((saver2.getSavingBalance())) + "\n");     
        
    }
}