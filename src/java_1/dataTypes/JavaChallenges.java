package java_1.dataTypes;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class

		printMsg("hello world",3);
		int n = 9;
		System.out.println(nthFibonacci(n));
		System.out.println(calcPay(40, 40, 2));
		System.out.println(solveQuadratic(10, 2, 8));
		System.out.println(reverseString("This is a reverse string"));
		System.out.println(shuffleMessage(new String[]{"hi dear friend", "dear hi friend", "friend dear hi"}));
		System.out.println(countQuarters(10.50));
		System.out.println(calcGPA(new int[]{72, 88, 67, 92, 98}));
		printEgg();
		Item pants = new Item("pants", 20.99);
		Item skirt = new Item("skirt", 15.75);
		Item tshirt = new Item("tshirt", 9.75);
		Item jeans = new Item("jeans", 35.99);
		System.out.println(totaledReceipt(new Item[]{pants, skirt, tshirt, jeans}));
	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		if(repeats > 0){
			System.out.println(msg);
			printMsg(msg, repeats-1);
		}
	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */
		if (n <= 1)
			return n;
		return nthFibonacci(n - 1) + nthFibonacci(n - 2);


	}

	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		double totalPayOut = hrsPerPeriod * hourlyRate * payPeriods;
		System.out.print("You worked " + hrsPerPeriod + " at " + hourlyRate + " a hour. For " + payPeriods + "your total is: ");

		return totalPayOut;
	}

	static double solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */

		double quadraticFormula = (int)Math.pow(x, 2) + y + z;


		return quadraticFormula;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		double dollar = amount * 100;
		int quarters = (int) (dollar / 25);

		return quarters;
	}

	static StringBuilder reverseString(String str) {
		//reverse the input string and return it.


		StringBuilder strReverse = new StringBuilder();
		strReverse.append(str);
		strReverse.reverse();

		return strReverse;
	}

	static double shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/


		double mesShuffle = messages.length * Math.random();
		System.out.println(messages[(int) mesShuffle].toString());

		return mesShuffle;
	}

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		int grade = scores.length -1;
		double gradeTotal = 0, average;
		for (int score : scores) {
			gradeTotal = gradeTotal + score;
		}
		average = gradeTotal / grade;
		if(average <= 59){
			return 0.0;
		} else if (average >= 60 && average <= 69) {
			return 1.0;
		} else if (average >= 70 && average <= 79) {
			return 2.0;
		} else if (average >= 80 && average <= 89) {
			return 3.0;
		} else if (average >= 90 && average <= 100) {
			return 4.0;
		}


		return average;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
		System.out.println("    --------");
		System.out.println("  /          \\");
		System.out.println(" /            \\");
		System.out.println("  --\"-'-\"-'-\"-");
		System.out.println(" \\            /");
		System.out.println("  \\__________/");



	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00

			double total = 0;

			for (Item transaction : transactions) {
				total = total + transaction.cost;
			}


			return total;

		}
	}