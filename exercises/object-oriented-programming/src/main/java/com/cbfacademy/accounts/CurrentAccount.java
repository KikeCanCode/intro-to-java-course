package com.cbfacademy.accounts;
/*public CurrentAccount(int accountNumber, double balance, double overdraftLimit) -
 constructor that accepts parameters representing the new account number, starting balance and overdraft limit
public double getOverdraftLimit() - returns the current overdraft limit
public void setOverdraftLimit() - sets the overdraft limit */


public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount (int accountNumber, double balance,double overdraftLimit){
        super(accountNumber, balance);

        this.overdraftLimit = overdraftLimit;

    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
    this.overdraftLimit = overdraftLimit;
    
    }
}
