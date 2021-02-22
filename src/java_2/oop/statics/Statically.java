package java_2.oop.statics;

public class Statically {

	static String glue = "Epoxy";
	String jello = "Jello";

	public static void main(String[] args) {
		explain();
	}

	void moveAndShake() {
		System.out.println("Never stagnate in life.  Be agile, change, and improve...");
	}

	static void stubborn() {
//		this.moveAndShake();
		System.out.println("I don't like to move it move it...");
	}

	static void explain() {
		stubborn();
		//This method should explain how the static modifier affects a method or a property.  What are the use cases of the static property?
	}



}
