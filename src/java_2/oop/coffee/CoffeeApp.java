package java_2.oop.coffee;

public class CoffeeApp {

	public static void main(String[] args) {
/*
	- Create 4 different CoffeeBean (instances) (Java, Kona, Geisha, etc.)
	- Create 4 different cups for the brewed coffee
	- Create at least 1 CoffeeMaker to brew the Coffee.
	- Brew Coffee in the Coffee Maker and fill the four cups with different types of Coffee.
	-
 */

		CoffeeBeans java = new CoffeeBeans("Java", "cuba", "gross");
		CoffeeBeans kona = new CoffeeBeans("Kona", "cuba", "ehh");
		CoffeeBeans geisha = new CoffeeBeans("Geisha", "cuba", "flat");
		CoffeeBeans black = new CoffeeBeans("Black", "cuba", "bitter");

		Cup mug = new Cup(8.0, "mug", "empty", "full");
		Cup glass = new Cup(6.0, "glass", "empty", "full");
		Cup jar = new Cup(9.0, "jar", "empty", "full");
		Cup cup = new Cup(7.0, "cup", "empty", "full");

		CoffeeMaker keureg = new CoffeeMaker("stuff", "more stuff", true);

		keureg.powerOn();

		java.roast(true);
		kona.roast(true);
		geisha.roast(true);
		black.roast(true);

		keureg.brew(java, mug);
		keureg.brew(kona, glass);
		keureg.brew(geisha, glass);
		keureg.brew(black, cup);

		keureg.powerOff();


//		keureg.powerOn();  (Defined in the Machine Interface)
		mug = keureg.brew(java,mug);
		mug.drink();
//		keureg.powerOff(); (Defined in the Machine Interface);
	}
}
