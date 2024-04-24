package com.cbfacademy.accounts; // package

/* public SavingsAccount(int accountNumber, double balance, double interestRate)- 
constructor that accepts parameters representing the new account number, starting balance and interest rate
public void applyInterest() applies interest to the account
public double getInterestRate() - returns the current interest rate
public void setInterestRate() - sets the interest rate
*/

public class SavingsAccount extends Account { // class

        private double interestRate;  //Define your instance - instance field
    //constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void applyInterest(){ //applies interest to the account 
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
    public double getInterestRate(){ //returns the current interest rate
        return interestRate;
    }
    public void setInterestRate(double interestRate) { // I had to add the if statement to check if interest is >0; because test was set to be -tive.
        if(interestRate > 0){
            this.interestRate = interestRate;
        }
         
    }
    @Override
    public double withdraw(double requested){
        return super.withdraw(requested);

    }
} 
  