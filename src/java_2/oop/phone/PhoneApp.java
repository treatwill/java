package java_2.oop.phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) {
		System.out.println("Let's make a Phone App");
/*
		-Use this to instantiate CellPhones and run the functions on the CellPhone.  You can run the following functions here in the main method, or add methods on this PhoneApp class and invoke them here.  The latter is probably preferred :)
		-iPhone-12, Samsung Galaxy S21, and any other phone model of your choosing.
		-Add 3 unique contacts to each cell phone
		-Make a phone call from each Cell Phone to a contact in the contact list of that Cell Phone
		-Update the contact list of a specific contact on one cell phone
		-Remove a Contact of a specific contact on another cell phone
		-Add a new contact to one of the cell phones.
		-Search for a contact by name in one of the cell phones.
		-Make the CellPhone class implement the Phoneable interface.  Implement the methods how you see fit in the CellPhone Class
*/

		Contact conOne = new Contact("Bo", 555555555, "Dallas, TX");
		Contact conTwo = new Contact("Jo", 444444444, "Dallas, TX");
		Contact conThree = new Contact("Po", 333333333, "Dallas, TX");
		List<Contact> conListOne = new ArrayList<>(Arrays.asList(conOne, conTwo, conThree));
		CellPhone myCell = new CellPhone(conListOne, 200.00, "Verizon", "Samsung", true);


		Contact conFour = new Contact("Ro", 888888888, "Dallas, TX");
		Contact conFive = new Contact("Yo", 777777777, "Dallas, TX");
		Contact conSix = new Contact("Lo", 222222222, "Dallas, TX");
		List<Contact> conListTwo = new ArrayList<>(Arrays.asList(conFour, conFive, conSix));
		CellPhone myCellOne = new CellPhone(conListTwo, 300.00, "ATT", "Iphone", true);


		Contact conSeven = new Contact("Ace", 111111111, "Dallas, TX");
		Contact conEight = new Contact("Tim", 666666666, "Dallas, TX");
		Contact conNine = new Contact("Polly", 999999999, "Dallas, TX");
		List<Contact> conListThree = new ArrayList<>(Arrays.asList(conSeven, conEight, conNine));
		CellPhone myCellThree = new CellPhone(conListThree, 200.00, "Verizon", "LG", false);



		myCell.call(conEight);
		myCellThree.pickUp();
		myCell.hangUp();
		conListThree.remove(conNine);
		conListTwo.add(conOne);
		System.out.println(conListThree);

	}
}
