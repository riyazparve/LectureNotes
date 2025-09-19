package com.riyaz.oops.encapsulation;

public class BankAccount {
    // private attributes
    private String accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, double initialBalance) {
	this.accountNumber = accountNumber;
	if (initialBalance >= 0) {
	    this.balance = initialBalance;
	} else {
	    this.balance = 0;
	}
    }

    // public method to deposit money
    public void deposit(double amount) {
	if (amount > 0) {
	    balance += amount;
	    System.out.println("Deposited: " + amount);
	} else {
	    System.err.println("Deposit amount must be positive.");
	}
    }

    // public method to withdraw money
    /*
     * Ensuring basic validation like preventing the withdrawal from resulting in a
     * negative balance
     */
    public void withdraw(double amount) {
	if (amount > 0 && amount <= balance) {
	    balance -= amount;
	    System.out.println("Withdrew: " + amount);
	} else {
	    System.err.println("Invalid withdrawal amount: " + amount + " available balance: " + balance);
	}
    }

    // public method to check balance
    public double getBalance() {
	return balance;
    }

    // public method to get account number
    public String getAccountNumber() {
	return accountNumber;
    }

}
