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

		CoffeeBeans java = new CoffeeBeans("black", "cuba", "gross");
		Cup mug = new Cup(8.0, "large", "empty", "full");
		CoffeeMaker keureg = new CoffeeMaker("stuff", "more stuff", true);
//		keureg.powerOn();  (Defined in the Machine Interface)
		mug = keureg.brew(java,mug);
		mug.drink();
//		keureg.powerOff(); (Defined in the Machine Interface);
	}
}
