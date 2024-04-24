package com.cbfacademy.accounts; // package

/* public SavingsAccount(int accountNumber, double balance, double interestRate)- 
constructor that accepts parameters representing the new account number, starting balance and interest rate
public void applyInterest() applies interest to the account
public double getInterestRate() - returns the current interest rate
public void setInterestRate() - sets the interest rate
*/

    public class SavingsAccount extends Account { // class
//Define your instance - instance field
  private double interestRate;
//constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void applyInterest(){//(double balance, double interestRate){ //applies interest to the account 
        // balance += balance + interestRate;
         double interest = getBalance() * interestRate;
         deposit(interest);
        }
    public double getInterestRate(){
        //this.interestRate = interestRate;
            return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
      @Override
       public double withdraw(double requested){
        return super.withdraw(requested);

        }
   // }
    /*Implement the "deposit" method to add a specified amount to the balance
@Override
    public double deposit(double amount){
        if (interestRate > 0);
        this.balance = balance += amount;
        return balance;
    }*/
}
//Implement the "withdraw" method to subtract a specified amount from the balance
/*@Override
    public double withdraw(double requested){
        this.balance = balance -= requested;
        return balance;
    }*/
 /*Implement the "getBalance" method to retrieve the current balance   
@Override 
    public double getBalance(){
    
    return balance;
    }
}*/

