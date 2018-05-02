package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Choose any number between 0 and 100.");
		int number = Integer.parseInt(input);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not a prime number.");
			} else {
				JOptionPane.showMessageDialog(null, "Your number is a prime number.");
			}
		}
	}
}
