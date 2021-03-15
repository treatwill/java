package java_2.oop.bank;

public class Customer {
    String firstName;
    String lastName;
    int ssn;
    String dob;
    double wallet;

    public Customer(String fName, String lName, int social, String birthDate, double cash) {
        this.firstName = fName;
        this.lastName = lName;
        this.ssn = social;
        this.dob = birthDate;
        this.wallet = cash;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public String getDob() {
        return dob;
    }

    public double getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn=" + ssn +
                ", dob='" + dob + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
    /*
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/




