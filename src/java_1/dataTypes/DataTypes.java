package java_1.dataTypes;

class DataTypes {

		int number = 2021;
		int yearOfBirth = 1977;
		int[] nums = {3,4,5,6,7,8,10,12};
		String movieName = "Meet The Parents";
		char male = 'm';
		String triplet = "3L";
		char female = 'f';
		double decimalVal = .0000000000001;
		int halfByte = 0101;



	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate data types for the inputs and the outputs

		//yearsToMonths(2);
		//monthsToHours(30);
		//yearsToMinutes(365);
		//centuriesToSeconds(1);

		//canDrive(21);
		//canDrive(15);
	}

	public static void yearsToMonths(int years){
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		int months = 1;
		years = (1 + months) * 12;

		System.out.println("That equals out to " + years + "Months!");
	}

	public static void monthsToHours(int months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours

		int hours = 24 * months;


		System.out.println("There " + hours + " Hours in a " + months + " day month !");
	}

	public static void yearsToMinutes(int days) {
		//	convert years to minutes using appropriate data types for the inputs and the outputs, 2 years => 17520 hours
		int minutes = 1440 * days;

		System.out.println("There are " + minutes + " minutes in " + days + " days!");
	}

	public static void centuriesToSeconds(long centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds

		int seconds = (60 * 60) * 24;
		long century = seconds * (((long)centuries * 100 * 365) + 25);

		System.out.println("There " + century + " x 10^9 seconds in " + centuries + " centuries!");
	}

	public static void dollarsToBitcoin(double dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars  3.1556952 x 10^9 Seconds
	}

	public static void canDrive(int age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.

		if (age >= 16) {
			System.out.println("You are old enough to drive");
		} else {
			System.out.println("You are too young to drive");
		}
	}

	String[] getDataTypes(int num1, boolean bool1, long long1) {
//		get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.
		return new String[]{null,null,null};
	}

}