package com.cbfacademy.accounts;
/*public CurrentAccount(int accountNumber, double balance, double overdraftLimit) -
 constructor that accepts parameters representing the new account number, starting balance and overdraft limit
public double getOverdraftLimit() - returns the current overdraft limit
public void setOverdraftLimit() - sets the overdraft limit */

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount (int accountNumber, double balance,double overdraftLimit){ //constructor that accepts parameters representing the new account number, starting balance and overdraft limit
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    public double setOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        //if( overdraftLimit > 0){
            this.overdraftLimit = overdraftLimit;
        }
    
    @Override
    public double withdraw(double requested) { //- withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
        //withdraw = balance - requested;
        if (requested <=(getBalance()) + overdraftLimit){
            this.balance -= requested;
            return requested;
           // return super.withdraw(requested);
        } else{
            return 0;
        }
    }
}
            /*if (requested > 0 && balance > requested){ // this was taken from saving account
                balance = balance - requested;
                return requested;
          
           } else if (balance > 0 && requested > getBalance()){ // I used get balance to implement inhenritance.
                //overdraftLimit = (requested -= getBalance());
                //super.withdraw(overdraftLimit); // this means if the request amount is > then 
                //return requested; 
            } else if (((requested > 0 ) && (requested > balance) && requested > getOverdraftLimit())){
                return 0;
            }
               //return requested;
            else{
        
              {
                balance = balance - requested; 
                return balance; 
         
            }   }
            return requested;

    }*/


