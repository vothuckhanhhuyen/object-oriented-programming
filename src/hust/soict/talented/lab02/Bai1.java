package hust.soict.talented.lab02;

import javax.swing.JOptionPane;

public class Bai1 {
	
	public static void main(String[] args) {
		
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You're chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
		
	}
	
}
