import javax.swing.JOptionPane;

public class PrimeCheck {
	public static String isPrime(long input) {
		if(input <= 1) {
			JOptionPane.showMessageDialog(null, "Input must be greater than 1.", "ERROR", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		for(int i = 2; i < input; i++) {
			if (input % i == 0) {
				return "composite";
			}
		}
		// TODO fix number larger than two to the thirty-two
		return "prime";
	}
}
