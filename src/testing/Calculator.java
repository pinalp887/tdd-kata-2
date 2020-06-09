package testing;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {

	static Scanner input = new Scanner(System.in);

	public static void selection() {
		Scanner reader = new Scanner(System.in);
		System.out.print("\nanother input please: ");
		String readString = input.nextLine();

		if (readString.isEmpty()) {
			System.exit(0);
		} else {
			double result = Operations.add(readString);
			System.out.println("\nThe Result is " + df.format(result));
			System.out.println("\nDo you want to continue?? press, y");
			String con = input.nextLine();
			if (con.equalsIgnoreCase("y")) {
				selection();
			}
		}

	}

	public static void calculator(String[] args) {
		if (args.length > 0) {
			double result = Operations.add(args[1]);
			System.out.println("\nThe Result is " + df.format(result));
			System.out.println("\nDo you want to continue?? press, y");
			String con = input.nextLine();
			if (con.equalsIgnoreCase("y")) {
				selection();
			} else if (con.isEmpty()) {
				System.exit(0);
			} else {
				System.exit(0);
			}
		}

	}

	public static void application(String[] args) {
		if (args.length > 0) {
			calculator(args);
		}
		selection();
	}

	public static void main(String[] args) {
		application(args);
	}

	private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
	private static DecimalFormat df = new DecimalFormat("0.00");
}
