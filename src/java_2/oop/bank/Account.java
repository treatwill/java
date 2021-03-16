package java_2.oop.bank;

import java.util.ArrayList;

public class Account {

    String bank;
    int number;
    String holder;
    double balance;
    String type;
    ArrayList<Account> transactions;
    Customer customer;



    public Account(String bank, int number, Customer customer, double balance, String type, ArrayList<Account> transactions) {

        this.bank = bank;
        this.number = number;
        this.customer = customer;
        this.balance = balance;
        this.type = type;
        this.transactions = transactions;
    }

    public void deposit(double depositBalance) {
        this.balance += depositBalance;
        System.out.println("You deposited " + depositBalance + ". Your new balance is " + this.balance + ".");
    }

    public void withdraw(double withdrawBalance) {
        if (this.balance - withdrawBalance <0) {
                System.out.println("Your balance is only " + this.balance + ".");
        } else {
            this.balance -= withdrawBalance;
            System.out.println("Your withdrawal of " + withdrawBalance + " was successful. you now have a balance of " + this.balance);
        }
    }


    public String getBank() {
        return bank;
    }

    public int getNumber(int number) {
        return number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Account> getTransactions() {
        return transactions;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bank='" + bank + '\'' +
                ", number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", transactions=" + transactions +
                ", customer=" + customer +
                '}';
    }

    /*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */


}
