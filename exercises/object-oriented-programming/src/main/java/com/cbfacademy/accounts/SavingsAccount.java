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

   private double interestRate;
    //private double balance;


//constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public double applyInterest(double balance, double interestRate){ //applies interest to the account 
        balance += balance * interestRate / 100;
        //double interest = getBalance() * (interestRate / 100); // Interest rate = balance * interest / 100 
        //deposit(interest); // After calculating interest rate - it is deposited into the account. 
            return interestRate;
        }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    //Implement the "deposit" method to add a specified amount to the balance
@Override
    public double deposit(double amount){
        this.balance = balance + amount;
        return balance;
    }

// Implement the "withdraw" method to subtract a specified amount from the balance
@Override
    public double withdraw(double amount){
        this.balance = balance - amount;
        return balance;
    }
 // Implement the "getBalance" method to retrieve the current balance   
@Override 
    public double getBalance(){
    return balance;
    }
}

