import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask user to input first name, declare input as a string

		System.out.println("Please enter your first name:");
		String firstname = scanner.next();

		// * Ask user to input last name, declare new string fullname =
		// (firstname + last name)
		// convert fullname to upper case

		System.out.println(" Please enter your last name: ");
		String lastname = scanner.next();
		String fullname = (firstname + lastname);
		fullname = fullname.toUpperCase();

		// Request user's age

		System.out.println("How old are you ?");
		int userAge = scanner.nextInt();

		// Request user's birth month

		System.out.println("Please enter the month you were born: ");
		String birthMonth = scanner.next();
		birthMonth = birthMonth.toUpperCase();

		// Request user's favorite ROYGBIC color...option to ask for HELP, if
		// needed

		System.out.println("Please enter your favorite ROYGBIV color; if you do not know "
				+ "your favorite, please enter \"HELP\"  : ");
		String color = "(R)ed,(O)range,(Y)ellow,(G)reen,(B)lue,(I)ndigo,(V)iolet,\"HELP\"";
		color = scanner.next();
		color = "(R)ed,(O)range,(Y)ellow,(G)reen,(B)lue,(I)ndigo,(V)iolet,\"HELP\"";

		if (color.equals("HELP")) {
			System.out.println("Please type one of these letters: (R)ed, (O)range, "
					+ "(Y)ellow, (G)reen, (B)lue, (I)ndigo, (V)iolet.");
		} 
		else if(color.equals("(R)ed,||(O)range,||(Y)ellow,||(O)range,||(G)reen,||(B)lue,||(I)ndigo,||(V)iolet"))
		
		{
			switch (color) {
			case "R":
				System.out.println("Red");
				break;
			case "O":
				System.out.println("Orange");
				break;
			case "Y":
				System.out.println("Yellow");
				break;
			case "G":
				System.out.println("Green");
				break;
			case "B":
				System.out.println("Blue");
				break;
			case "I":
				System.out.println("Indigo");
				break;
			case "V":
				System.out.println("Violet"); {

				// * Ask user how many siblings do they have

				System.out.println(" How many siblings do you have ?");

				int retireAge;

				if (userAge % 2 == 0) {
					retireAge = userAge + 12;
				} else
					retireAge = (userAge + 13);
				{

					int monthIndex1 = 0;
					int monthIndex2 = 1;

					int compareResult = 1;
					int bankAmt = 0;

					while (monthIndex2 < 4 && compareResult != 0) {

						String letterOfMonth = birthMonth.substring(monthIndex1, monthIndex2);
						monthIndex1 = monthIndex1 + 1;
						monthIndex2 = monthIndex2 + 1;

						int nameIndex1 = 0;
						int nameIndex2 = 1;

						int letterCheck = 1;

						while (nameIndex2 < 2 && letterCheck > 0 &&
						 compareResult != 0){
							

							String letterInName = fullname.substring(nameIndex1, nameIndex2);
							nameIndex1 = nameIndex1 + 1;
							nameIndex2 = nameIndex2 + 1;

							compareResult = letterOfMonth.compareTo(letterInName);

							if (compareResult == 0) {
								letterCheck = 1;

							}
							if (monthIndex1 == 0) {

								bankAmt = 100;
							}

							else if (monthIndex1 == 1) {
								bankAmt = 200;
							} else if (monthIndex1 == 2) {
								bankAmt = 300;
							}

							// System.out.println(bankAmt);
							//
							// System.out.println("How many siblings do you have
							// ?");

							// String color = scanner.next();

							// while (color.equals("HELP") && !color.equals("R")
							// &&
							// !color.equals("O") && !color.equals("Y")
							// && !color.equals("G") && !color.equals("B") &&
							// !color.equals("I") && !color.equals("V")) {

							}

							switch (color) {
							case "R":
								System.out.println("Red");
								break;
							case "O":
								System.out.println("Orange");
								break;
							case "Y":
								System.out.println("Yellow");
								break;
							case "G":
								System.out.println("Green");
								break;
							case "B":
								System.out.println("Blue");
								break;
							case "I":
								System.out.println("Indigo");
								break;
							case "V":
								System.out.println("Violet");
							}
						}

					}

					// String color = scanner.next();
					// String transport = color;
					// if (color == 'R') {
					// transport = "Boat"; }
					//
					// else if (color == 'O') {
					// transport = "Car"; }
					//
					// else if (color == 'Y') {
					// transport = "Bike"; }
					//
					// else if (color == 'G'); {
					// transport = "Skateboard"; }
					//
					// else if (color == 'B'); {
					// transport = "Segway"; }
					//
					// else if (color == 'I'); {
					// transport = "Horse"; }
					//
					// else if (color == 'V'); {
					// transport = "COTA"; }
					// */
					//
					//

					

					scanner.close();
				}

			}
		}
	}
}

