package java_2.oop.bank;

import java.util.ArrayList;

public class Bank {


    Customer customer;
    ArrayList<Account> accList = new ArrayList<>();



    public ArrayList<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public Account openAccount(Account account) {


        accList.add(account);

        return account;
}


    public Account closeAccount(Account account) {

        accList.remove(account);

        return account;
}

    public Customer getAccountByCustomer(String getFirstName){

        System.out.println(getFirstName);
        return customer;
    }

    public Account getAccountByNumber(int getNumber) {

        System.out.println(getNumber);

        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customer=" + customer +
                ", accList=" + accList +
                '}';
    }

    /*
		Properties:
			accounts;


		Methods :
			openAccount(); //create a new account, add it to the accounts list, and return it.
			closeAccount(Account); close the account by removing it from the account list. and removing it's association with this Bank
	 		getAccountByCustomer(Customer);
	 		getAccountByNumber(acctNum);
	 */

}