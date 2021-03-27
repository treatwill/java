package java_2.oop.bank;

import java.util.ArrayList;

public class BankingApp {

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<>();
			/*
				-Create a Bank
				-Create 5 Customers
				-Open a new account for each customer.
				-have 3 customers withdraw and deposit, making sure the account balances update.
				-Close 2 of the customer accounts.
				-view the opened accounts at the Bank.
				-find an account by any of the customer credentials
				-find an account by account number.
		 	*/
		Bank firstBank = new Bank();

		Customer cusOne = new Customer("Jaleel", "Williams", 111111111, "05/03/94", 500.00);
		Customer cusTwo = new Customer("Jen", "Williams", 222222222, "05/03/94", 500.00);
		Customer cusThree = new Customer("Jason", "Williams", 333333333, "05/03/94", 500.00);
		Customer cusFour = new Customer("Jeff", "Williams", 444444444, "05/03/94", 500.00);
		Customer cusFive = new Customer("Javier", "Williams", 555555555, "05/03/94", 500.00);

		Account accOne = new Account("firstBank", 1234, cusOne, 500.00, "Checking", accountList);
		Account accTwo = new Account("firstBank", 4321, cusTwo, 500.00, "Checking", accountList);
		Account accThree = new Account("firstBank", 12345, cusThree, 500.00, "Checking", accountList);
		Account accFour = new Account("firstBank", 54321, cusFour, 500.00, "Checking", accountList);
		Account accFive = new Account("firstBank", 12435, cusFive, 500.00, "Checking", accountList);

		firstBank.openAccount(accOne);
		firstBank.openAccount(accTwo);
		firstBank.openAccount(accThree);
		firstBank.openAccount(accFour);
		firstBank.openAccount(accFive);
		System.out.println(firstBank);
		firstBank.closeAccount(accFive);
		firstBank.closeAccount(accFour);
		System.out.println(firstBank);
		System.out.println("Get customer by name" + firstBank.getAccountByCustomer("Jaleel"));
		System.out.println("Get customer by account number" + firstBank.getAccountByNumber(4321));


		System.out.println(accOne);
		System.out.println(accOne.getBalance());
		accOne.withdraw(200);
		accOne.deposit(100);
		System.out.println(accOne.getBalance());

		System.out.println(accTwo);
		System.out.println(accTwo.getBalance());
		accTwo.withdraw(200);
		accTwo.deposit(100);
		System.out.println(accTwo.getBalance());

		System.out.println(accThree);
		System.out.println(accThree.getBalance());
		accThree.withdraw(200);
		accThree.deposit(100);
		System.out.println(accThree.getBalance());
	}
}
