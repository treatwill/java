package java_3.serial;

import java.io.*;

public class Fax {

/*	Properties :
		brand
		model
		year

	Methods :
		transmit(message)
		receive(message)

 */
	String brand;
	String model;
	int year;

	public Fax(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	private void transmit(Message msg, String name) throws IOException {
		//The transmit message must serialize a Message, and write it to a file.
		FileOutputStream files = new FileOutputStream(name);
		ObjectOutputStream objectFiles = new ObjectOutputStream(files);
		objectFiles.writeObject(msg);
		files.close();
		objectFiles.close();
	}

	private Message receive(String msg, String name) throws IOException, ClassNotFoundException {
//		The receive method must deserialize a message, by reading it in from a file.
		FileInputStream files = new FileInputStream(name);
		ObjectInputStream objectFiles = new ObjectInputStream(files);
		Message messageFile = (Message) objectFiles.readObject();
		files.close();
		objectFiles.close();

		return messageFile;
	}


	@Override
	public String toString() {
		return "Fax{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", year=" + year +
				'}';
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String name = "TEKcamp";
		Message message = new Message(1,"This place is tough");
		Fax fax = new Fax("Hillshire", "HP", 1994);

		fax.transmit(message, name);
		Message serial = fax.receive("Here's your file", name);
		System.out.println(message);
		System.out.println(serial);




	}
}
