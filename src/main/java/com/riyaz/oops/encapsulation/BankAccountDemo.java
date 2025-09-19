package com.riyaz.oops.encapsulation;

/* Access Modifiers: Encapsulation often uses access modifiers like private, public, 
 * and protected to control access to the class's fields and methods. 
 * This prevents external functions from accessing or modifying 
 * internal data directly without using appropriate methods (getters and setters).
 * Purpose: Encapsulation helps in data hiding. 
 * It restricts direct access to some of an object's components and 
 * prevents accidental interference and misuse of the methods and data.
*/

public class BankAccountDemo {

    public static void main(String[] args) {
    	// create an object of BankAccount class
	BankAccount account = new BankAccount("123456789", 1000.0);
	account.deposit(500.0);
	account.withdraw(200.0);
	System.out.println("Account Number: " + account.getAccountNumber());
	
	account.withdraw(2000.0); // Invalid withdrawal
	account.deposit(-100.0); // Invalid deposit
    }

    /*
     * OUTPUT: 
     * Deposited: 500.0 
     * Withdrew: 200.0 
     * Account Number: 123456789 Invalid withdrawal amount: 2000.0 available balance: 1300.0 
     * Deposit amount must be positive.
     */
}
