package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String question = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int numNickels = Integer.parseInt(question);
		// Ask the user how many dimes they have, and convert their answer
String questionTwo = JOptionPane.showInputDialog("How many dimes do you have?");
int numDimes = Integer.parseInt(questionTwo);
		// Ask the user how many quarters they have, and convert their answer
String questionThree = JOptionPane.showInputDialog("How many quarters do you have?");
int numQuarters = Integer.parseInt(questionThree);
		// Calculate how much money the user has and save it in a double variable 
double money = (numNickels*0.05) + (numDimes*0.10) + (numQuarters*0.25);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" +money);
	}
}

