package day3;

import javax.swing.JOptionPane;

public class popup {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Good afternoon!");
		System.out.println("Good afternoon!");
		String name = JOptionPane.showInputDialog("What is your name?");
		if (name.equals("Trevor")) {
			System.out.println("You are awesome");
		} else {
			System.out.println("You are awesome too");
		}
	}
}
