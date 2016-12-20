package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String age = JOptionPane.showInputDialog("What is your age?");
	JOptionPane.showMessageDialog(null, name + ", you are " + age + " years old.  Maybe you should be more careful giving your information to a computer");
}
}
