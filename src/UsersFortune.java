import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class UsersFortune {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println("Please enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = input.nextLine();
		System.out.println("Please enter your age:");
		int userAge = input.nextInt();
		input.nextLine();
		System.out.println("What is your favourite ROYGBIV color?:");
		String favColor = input.nextLine();

		while (favColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. ");
			favColor = input.nextLine();
		}

		System.out.println("Please enter your birth month (as an \'int\'):");
		int userBirthMonth = input.nextInt();

		System.out.println("Please enter the number of your siblings:");
		int noOfSiblings = input.nextInt();

		int ageOfRetire = userAge;

		String homeLocation = null;

		double bankBal = 0;

		String modeOfTransport = null;

		if (!(userAge % 2 == 0)) {
			ageOfRetire = 70;
		} else {
			ageOfRetire = 69;
		}

		if (noOfSiblings < 0) {
			System.out.println("Bad location!");
			System.out.println("Please re-enter your location");

		}

		else {
			switch (noOfSiblings) {
			case 0:
				homeLocation = "Nairobi, Kenya";
				break;
			case 1:
				homeLocation = "Addis Ababba, Ethiopia";
				break;
			case 2:
				homeLocation = "Lagos, Nigeria";
				break;
			case 3:
				homeLocation = "Kigali, Rwanda";
				break;
			default:
				homeLocation = "Mogadishu, Somalia";
			}
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
			modeOfTransport = "Mahindra";
			break;
		default:
			modeOfTransport = "Isuzu 4WD";
			break;
		}

		if (userBirthMonth < 1 || userBirthMonth > 12) {
			bankBal = 0.00;
		}

		else if (userBirthMonth >= 1 && userBirthMonth <= 4) {
			bankBal = 256000.76;
		}

		else if (userBirthMonth >= 5 && userBirthMonth <= 8) {
			bankBal = 3687105.42;
		}

		else if (userBirthMonth >= 9 && userBirthMonth <= 12) {
			bankBal = 86.23;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + ageOfRetire + " years with "
				+ money.format(bankBal) + " in the bank, " + "\n a vacation home in " + homeLocation
				+ ", and travel by " + modeOfTransport + ".");
		input.close();

	}

}
