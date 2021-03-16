package java_2.oop.monkey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonkeyApp {

	public static void main(String[] args) {
        /*
        - Add 3 monkeys to the MonkeyCage, utilizing the inner Monkey class and the addMonkey() method
        - Determine whether the majority of them are smiling or not.  write your code in the areMonkeySmiling(arr) method

        example :
        [Rafiqi (smiling), Curious George (smiling), King Kong (not smiling)] => areMonkeysSmiling(arr) => true

        You are NOT allowed to move the Monkey class outside of the MonkeyCage class.  Keep it exactly where it is.
        */

		List<MonkeyCage.Monkey> monList = new ArrayList<>(Arrays.asList());
		MonkeyCage coolZoo = new MonkeyCage(monList);

		MonkeyCage.Monkey monkeyOne = new MonkeyCage.Monkey("George", true);
		MonkeyCage.Monkey monkeyTwo = new MonkeyCage.Monkey("Ceasar", false);
		MonkeyCage.Monkey monkeyThree = new MonkeyCage.Monkey("Jeff", true);

		coolZoo.addMonkey(monkeyOne);
		coolZoo.addMonkey(monkeyTwo);
		coolZoo.addMonkey(monkeyThree);
		coolZoo.removeMonkey(monkeyThree);




	}
}
