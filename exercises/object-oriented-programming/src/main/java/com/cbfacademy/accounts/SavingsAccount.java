package com.cbfacademy.accounts; // package

/* public SavingsAccount(int accountNumber, double balance, double interestRate)- 
constructor that accepts parameters representing the new account number, starting balance and interest rate
public void applyInterest() applies interest to the account
public double getInterestRate() - returns the current interest rate
public void setInterestRate() - sets the interest rate
*/

    public class SavingsAccount extends Account { // class

// inside the class define the data that can be stored 
//Define your instance - instance field
    double interestRate;

}
//constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        
       // this.interestRate = interestRate;
    }
    public void applyInterest(){ //applies interest to the account
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }

}


