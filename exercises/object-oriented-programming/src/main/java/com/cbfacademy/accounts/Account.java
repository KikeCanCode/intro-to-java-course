package com.cbfacademy.accounts;
/*Part 1
Inside the accounts package, create a class called Account with the following members:

public Account(int accountNumber, double balance) - constructor that accepts parameters representing the new account number and starting balance
public double getBalance() - returns the current account balance
public int getAccountNumber() - returns the account number
public double deposit(double amount) - deposits funds to the account and returns the new balance
public double withdraw(double requested) - withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
Notes
This account doesn't have an overdraft facility.
The balance of an account may only be modified through the deposit() and withdraw() methods.
Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values*/

public class Account {
    double balance;
    int accountNumber;
    double deposit;
    double withdraw;
    //double overdraft;

//- constructor that accepts parameters representing the new account number and starting balance
    public Account(int accountNumber, double balance){
    //public Account(int accountNumber, double balance, double deposit, double withdraw){    example of a constroctor that will accept all ettribute
    this.balance = balance;
    this.accountNumber = accountNumber;
    //this.deposit = deposit;
    //this.withdraw = withdraw;
    }
    public double getBalance(){ //- returns the current account balance 
        return balance;
    }
    public int getAccountNumber(){ //- returns the account number
        return accountNumber;   
    } 
    public double deposit(double amount) { //- deposits funds to the account and returns the new balance
        return deposit;
    }
    public double withdraw(double requested) { //- withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
    
        if (balance >= requested){
            balance = balance - requested;
            return requested;
        } else {
        //if (balance < requested){
    
            return 0;
        }
    }
}


//newBalance = balance - withdraw
//newBalance <= 0

/*if balance => 0 = overdraft 0
if balance < 0 = overdraft negative (balance)

 if (balance >= 0){
    overdraft = 0;
 }
 if (balance < 0){
 overdraft = - balance;
 //return overdraft;
 }*/

//public double getOverdraft(double amount){
    
// 