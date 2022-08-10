package _03_string_conversion._4_voting_booth;
import javax.swing.JOptionPane;
public class Voting_Booth {
	public static void main(String[] args) {
		String Age = JOptionPane.showInputDialog("How old are you?");
		int ageAsInt = Integer.parseInt(Age);
		if (ageAsInt >= 18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}
		else if (ageAsInt <18) {
			JOptionPane.showMessageDialog(null, "You must be at least 18 to vote!");
		}
	}
}
