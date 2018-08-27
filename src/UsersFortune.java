import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class UsersFortune {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println("Please enter your first name:");
		String firstName = input.nextLine();

		if (firstName.isEmpty()) {
			System.out.println("Invalid entry! Please re-enter your first name: ");
			firstName = input.nextLine();
		}
		System.out.println("Please enter your last name:");
		String lastName = input.nextLine();

		if (lastName.isEmpty()) {
			System.out.println("Invalid entry! Please re-enter your last name: ");
			lastName = input.nextLine();
		}

		// Validate user input not to enter less than zero or null for any integer
		// inputs.
		System.out.println("Please enter your age:");
		String userAge = input.nextLine();

		if (userAge.isEmpty() || Integer.parseInt(userAge) < 0) {
			System.out.println("Invalid entry! Please re-enter your age: ");
			userAge = input.nextLine();
		}

		System.out.println("What is your favourite ROYGBIV color;" + "If you don't know what is ROYGBIV type \"help\"");
		String favColor = input.nextLine();
		favColor = favColor.toLowerCase();

		if (favColor.isEmpty()) {
			System.out.println(
					"Invalid entry! Please re-enter your favorite color \nIf you don't know what is ROYGBIV type \"help\": ");
			favColor = input.nextLine();
		}
		// user enters capital or lowercase letters for favorite colors.
		while (favColor.equalsIgnoreCase("help") || favColor.isEmpty()) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. ");
			favColor = input.nextLine();
		}

		// checks if user enters an Integer.
		System.out.println("Please enter your birth month (as an \'int\'):");
		String userBirthMonth = input.nextLine();

		if (userBirthMonth.isEmpty() || Integer.parseInt(userBirthMonth) < 0) {
			System.out.println("Invalid entry! Please re-enter your birth month: ");
			userBirthMonth = input.nextLine();
		}
		// checks if user enters an Integer.
		System.out.println("Please enter the number of your siblings:");
		String noOfSiblings = input.nextLine();

		if (noOfSiblings.isEmpty() || Integer.parseInt(noOfSiblings) < 0) {
			System.out.println("Invalid entry! Please re-enter the number of siblings: ");
			noOfSiblings = input.nextLine();
		}

		// Initialize the working variables;
		int ageOfRetire = Integer.parseInt(userAge);
		String homeLocation = null;
		double bankBal = 0;
		String modeOfTransport = null;

		//
		if ((Integer.parseInt(userAge)) % 2 == 0) {
			ageOfRetire = 70;
		} else {
			ageOfRetire = 69;
		}
		switch (Integer.parseInt(noOfSiblings)) {
		case 0:
			homeLocation = "Mombasa, Kenya";
			break;
		case 1:
			homeLocation = "Addis Ababba, Ethiopia";
			break;
		case 2:
			homeLocation = "Lagos, Nigeria";
			break;
		case 3:
			homeLocation = "Cairo, Egypt";
			break;
		default:
			homeLocation = "Nairobi, Kenya";
		}

		switch (favColor) {
		case "red":
			modeOfTransport = "Maserati";
			break;
		case "orange":
			modeOfTransport = "Toyota Camry";
			break;
		case "yellow":
			modeOfTransport = "Honda CRV";
			break;
		case "green":
			modeOfTransport = "Mazda MDX";
			break;
		case "blue":
			modeOfTransport = "Ford Focus";
			break;
		case "indigo":
			modeOfTransport = "Bugatti";
			break;
		default:
			modeOfTransport = "Porsche";
			break;
		}

		if (Integer.parseInt(userBirthMonth) < 1 || Integer.parseInt(userBirthMonth) > 12) {
			bankBal = 0.00;
		}

		else if (Integer.parseInt(userBirthMonth) >= 1 && Integer.parseInt(userBirthMonth) <= 4) {
			bankBal = 256000.76;
		}

		else if (Integer.parseInt(userBirthMonth) >= 5 && Integer.parseInt(userBirthMonth) <= 8) {
			bankBal = 3687105.42;
		}

		else if (Integer.parseInt(userBirthMonth) >= 9 && Integer.parseInt(userBirthMonth) <= 12) {
			bankBal = 86.23;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + ageOfRetire + " years with "
				+ money.format(bankBal) + " in the bank, " + "\na vacation home in " + homeLocation + ", and travel by "
				+ modeOfTransport + ".");

		input.close();

	}

}
