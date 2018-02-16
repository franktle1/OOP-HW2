package edu.albany.hw2.morse;

import javax.swing.JOptionPane;


//to run this program in cmd prompt, go to working directory, javac MorseCodeDriver, then go to cd to src folder
//run java  edu.albany.hw2.morse.MorseCodeDriver
public class MorseCodeDriver {

	public static void main(String[] args) {
		//args contains the command line args
		//starts at [1]...
		//if [1] is not null, ask user to receive input, else parse String[] args
		MorseCodeGenerator r;
		String userInput;
		
		//This may not be the best way to test it, but it'll serve as a placeholder for now
		try {
			System.out.println("Receiving Command Line.\nFirst argument is : " + args[0]);
			r = new MorseCodeGenerator(args);
			System.out.println(r.getOutputString());
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Receiving input from user.");
			userInput = JOptionPane.showInputDialog(null, "Enter a string you would like to parse.");
			r = new MorseCodeGenerator(userInput);
			System.out.println(r.getOutputString());
			}	
		
	}
	
	
	

}
