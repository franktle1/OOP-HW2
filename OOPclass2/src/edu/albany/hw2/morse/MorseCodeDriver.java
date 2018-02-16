package edu.albany.hw2.morse;

import javax.swing.JOptionPane;


//to run this program in cmd prompt, go to working directory, javac MorseCodeDriver, then go to cd to src folder
//run java  edu.albany.hw2.morse.MorseCodeDriver
public class MorseCodeDriver {

	public static void main(String[] args) {
		//args contains the command line args
		//starts at [1]...
		//if [1] is not null, ask user to receive input, else parse String[] args
		try {
			System.out.println("First argument is :" + args[0]);}
			//MorseCodeGenerator r = new MorseCodeGenerator(args);}
		catch(ArrayIndexOutOfBoundsException e){
			String userInput = JOptionPane.showInputDialog(null, "Enter a string you would like to parse.");
			//MorseCodeGenerator r = new MorseCodeGenerator(userInput);
			System.out.println("Hello");
		}
//		
//		
//		System.out.println("First argument is :" + args[0]);

	}
	
	
	

}
