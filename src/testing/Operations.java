package testing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operations {
	public static double add(String data) {
		try {

			if (data.isEmpty()) {
				return 0;
			} else if (data.contains(",")) {
				String[] tokens = data.split(",|\n");

				return sum(tokens);
			} else {
				return Double.parseDouble(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.log(Level.OFF, "\nPlease enter correct inputs");
			System.exit(0);
		}
		return 0;
	}

	public static double sum(String[] tokens) {
		try {

			double sum = 0;
			for (int i = 0; i < tokens.length; i++) {
				sum += Double.parseDouble(tokens[i]);
			}
			return sum;
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.log(Level.OFF, "\nPlease enter correct inputs");
			System.exit(0);
		}
		return 0;
	}

	private static final Logger LOGGER = Logger.getLogger(Operations.class.getName());
}
