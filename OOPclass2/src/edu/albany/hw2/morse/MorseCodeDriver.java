package edu.albany.hw2.morse;

import javax.swing.JOptionPane;


//to run this program in cmd prompt, go to working directory, javac MorseCodeDriver, then go to cd to src folder
//run java  edu.albany.hw2.morse.MorseCodeDriver
public class MorseCodeDriver {

	/*
	For this project, I used a HashMap in the MorseCode Class to contain the key-value pairings of the String Value and the corresponding
	Morse Code String. At first, I completed  the program using Enums and switch statements to produce the correct translations
	and reinforce the Type integrity for appending String text to the output string, however after realizing that HashMaps were better at 
	containing Key-Value Pairs, I replaced the old system with the one you see now. It was less code, and it is much more easier to handle.
	*/
	
	
	public static void main(String[] args) {
		MorseCodeGenerator r;
		String userInput;

		String[] options = {"Command Line", "User Input", "Exit"};
		int results = JOptionPane.showOptionDialog(null, "Please Select One:","Menu" ,0, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
		switch(results) {
		case 0:
			System.out.println("Cmd");
			try {
				System.out.println("Receiving Command Line.\nFirst argument is : " + args[0]);
				r = new MorseCodeGenerator(args);
				System.out.println(r.getOutputString());
				}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Nothing Entered in Command Line.");
			}
			break;
		case 1:
			System.out.println("Receiving input from user.");
			userInput = JOptionPane.showInputDialog(null, "Enter a string you would like to parse.");
			r = new MorseCodeGenerator(userInput);
			System.out.println(r.getOutputString());
			break;
		case 2:
			System.out.println("Exit");
			System.exit(0);
			break;
		default:
			System.out.println("Default");
			System.exit(0);
		}
		
	}
	
	
	

}
