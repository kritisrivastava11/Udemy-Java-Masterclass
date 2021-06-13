package com.kriti;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		this("00000", 0.00, "Default Name", "Default Name", "Default Phone number");
		System.out.println("Empty Constructor is called");
	}

	public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Amount " +depositAmount+ " is deposited, Total balance is " +this.balance);
	}

	public void withdraw(double withdrawlAmount) {
		if(withdrawlAmount <= this.balance) {
			this.balance -= withdrawlAmount;
			System.out.println(withdrawlAmount+ " is withdrawn, Current Balance is " +this.balance);
		}else {
			System.out.println(withdrawlAmount+ " is requested, Current balance is " +this.balance+ ". Insufficient Balance. Process Failed!");
		}
	}
}
