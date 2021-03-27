package java_2.oop.phone;

import java.util.List;

class CellPhone implements Phoneable{

//interface with some composition

    private List<Contact> contactList;
    private double cost;
    private String carrier;
    private String brand;
    private boolean power;

    public CellPhone(List<Contact> contactList, double cost, String carrier, String brand, boolean power) {
        this.contactList = contactList;
        this.cost = cost;
        this.carrier = carrier;
        this.brand = brand;
        this.power = power;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public double getCost() {
        return cost;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isPower() {
        return power;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
        System.out.println("Contact added!");
    }

    public void updateContact(Contact contact, String name, int phoneNumber, String address){
        if (contactList.contains(contact)){
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setAddress(address);
            System.out.println("Contact updated");
        }
    }

    public void removeContact(Contact contact){
        contactList.remove(contact);
    }
    public Contact searchContact(String name, int phoneNumber, String address){
        for (Contact contact: contactList){
            if(contact.getName().equals(name)){
                return contact;
            } else if (contact.getAddress().equals(address)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public void call(Contact contact) {
        System.out.println(contact.getPhoneNumber() + "is calling");
    }



    @Override
    public void ring() {
        System.out.println("Phone ringing");
    }

    @Override
    public void hangUp() {
        System.out.println("Call ended");
    }

    @Override
    public void pickUp() {
        System.out.println("Call answered");
    }

    @Override
    public void powerOff() {
        this.power = false;
        System.out.println("Phone is turned off.");
    }

    @Override
    public void powerOn() {
        this.power = true;
        System.out.println("Phone is turned on.");
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "contactList=" + contactList +
                ", cost=" + cost +
                ", carrier='" + carrier + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }

    /*
	* Properties :
	* 	contact list
	* 	cost
	*   carrier (Verizon, AT&T, T-Mobile, etc.)
	*   brand (Apple, Samsung, Motorola, etc.)
	* 	power (is the phone turned on or off? yes or no)

	* Functionality :
	 	- call(Contact); display a message indicating the Contact's phone number is being called. Note that the cell phone can only call contacts that are in the contact list.
		- addContact(Contact) add a new Contact to the contact list.
		- updateContact(Contact) //setter
		****When adding or updating be sure to check if the contact already exists****
		- removeContact(Contact) remove a contact from the contact list of the cell phone
		- searchContacts(Contact) return a contact from the contact list if one exists.
		* getters and setters for carrier, brand, and cost

****Be sure not to expose the inner workings of the CellPhone (use concepts of encapsulation)**
*/
}


