package java_2.oop.rainforest;

public class RainforestApp {

	public static void main(String[] args) {
		//	You are exploring the rainforests of the Amazon.  You have observed many different types of wildlife on your excursion.  To jog your memory,  different kinds of Rainforest Animals that you observed are found in the following URL : https://www.ietravel.com/blog/amazon-rainforest-animals-beginners-guide-21-species.  Feel free to use additional resources for more animal ideas.

		//	Pick 6 rainforest creatures and model them using the RainforestCreature class. i.e. Instantiate 6 rainforest creatures. Each Rainforest Creature should have 1 unique characteristic , and 1 unique action that it can do in addition to any general characteristics and actions that Creatures can do in general.*/

/*		Instantiate all 6 rainforest creatures here, print to the console each Rainforest Creature as a String representation, and have them perform any actions defined in the RainforestCreature class.
		ex : RainforestCreature riverDolphin = new RiverDolphin("riverDolphin","Amazon","pink",new String[]{"fish","crabs","turtles"};
			System.out.println(riverDolphin); => RiverDolphin{ properties... }.
			riverDolphin.eat() => "The river dolphin is eating fish."
		choose your own characteristics and methods to model).
*/
		Tapir tapir = new Tapir("Omnivorous", "Calm");
		System.out.println(tapir);
		tapir.sleep();
		tapir.looks();
		Jaguar jaguar = new Jaguar("Carnivore", true);
		System.out.println(jaguar);
		jaguar.sleep();
		jaguar.species();
		RiverOtter riverOtter = new RiverOtter("Carnivore", true);
		System.out.println(riverOtter);
		riverOtter.sleep();
		riverOtter.lives();
		Anaconda anaconda = new Anaconda("Carnivore", true);
		System.out.println(anaconda);
		anaconda.sleep();
		anaconda.movement();
		Sloth sloth = new Sloth("Herbivore", "Slow");
		System.out.println(sloth);
		sloth.sleep();
		sloth.sleepSpace();
		Okapi okapi = new Okapi("Herbivore", true);
		System.out.println(okapi);
		okapi.sleep();
		okapi.graze();
	}

}
