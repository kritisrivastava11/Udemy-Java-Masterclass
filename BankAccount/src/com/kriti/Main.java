package com.kriti;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345", 345.98, "Kriti", "123kriti@mail.com", "1124678");
		account.withdraw(1300);
		account.setBalance(1400);
		account.deposit(156);
		account.withdraw(1300);
	}

}
