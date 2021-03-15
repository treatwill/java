package java_2.oop.phone;

class Contact {

    String name;
    int phoneNumber;
    String address;

    public Contact(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {

        return phoneNumber;
    }

    public String getAddress() {

        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    /*
	Properties :
        - Name
        - Phone number
		- Address
*/
}

