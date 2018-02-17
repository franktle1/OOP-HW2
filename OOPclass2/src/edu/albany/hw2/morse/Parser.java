package edu.albany.hw2.morse;

import java.util.HashMap;


//the purpose of this class is to break down the user input into easy to handle strings
//command line args may or may not contain space; after every word, you need to add a space
		//Example input ./javafile Hello " " World.		------> mmmm   mmmm
		//Example input ./javafile Hello World			------> mmmm mmmm
public class Parser {
	private String outputString;
	private StringBuffer sb;
	private MorseCode codes;

	public Parser() {
		sb = new StringBuffer();
		codes = new MorseCode();
	}
	
	public void parseCmd(String[] args) {
		for(String word: args) {				
			if(word.compareTo(" ")==0) {	
				sb.append(" ");
				 }
			else { 
				convertStringToCode(word);					//this will past each argument word of word and add additional spacing if not available
				sb.append(" ");	}			
		}//for
	}//end of method

	public void parseUserInput(String userInput) {
			convertStringToCode(userInput); 
		
		
	}
	
	//this allows the parser to return the morseCode Object
	public String getMorseCode() {
		return sb.toString();
	}
	
	
	public void convertStringToCode(String str) {
		HashMap<String, String> codeMap = codes.getCodeMap();
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			String input = Character.toString(letter).toUpperCase();
			if(input.equals(" ")) {										//This is a line to catch spaces for the user input option
				sb.append(" ");
				continue;
				}
			if(codeMap.get(input) != null) {
				sb.append(codeMap.get(input));}
			else
				System.out.println(input + " does not exist in Morse Code mapping yet.");
		}//for
	}//convertString method


} //end of Class


//public Parser() {
//this.morseCode = new MorseCode();
//}


//if(word.compareTo(" ")==0) {
//morseCode.appendString(Morse.SPACE); }
//else { 
//convertStringToCode(word);					//this will past each argument word of word and add additional spacing if not available
//morseCode.appendString(Morse.SPACE);			
//}


//
////this will be parsing individual words
//public void convertStringToCode(String str) {
//	//this is where the case statements go
//	//morseCode.appendString("**arg**");
//	//CONCERN: having so many nested-for-loops will make the performance of this program really slow. I know it.
//	//loop through the word
//	for(int i = 0; i < str.length(); i++) {
//		char letter = str.charAt(i);
//		String input = Character.toString(letter).toUpperCase();
//		
//		switch(input) {
//		case "A": 
//			morseCode.appendString(Morse.A);
//			break;
//		case "B":
//			morseCode.appendString(Morse.B);
//			break;
//		case "C": 
//			morseCode.appendString(Morse.C);
//			break;
//		case "D":
//			morseCode.appendString(Morse.D);
//			break;
//		case "E": 
//			morseCode.appendString(Morse.E);
//			break;
//		case "F":
//			morseCode.appendString(Morse.F);
//			break;
//		case "G": 
//			morseCode.appendString(Morse.G);
//			break;
//		case "H":
//			morseCode.appendString(Morse.H);
//			break;
//		case "I": 
//			morseCode.appendString(Morse.I);
//			break;
//		case "J":
//			morseCode.appendString(Morse.J);
//			break;
//		case "K": 
//			morseCode.appendString(Morse.K);
//			break;
//		case "L":
//			morseCode.appendString(Morse.L);
//			break;
//		case "M": 
//			morseCode.appendString(Morse.M);
//			break;
//		case "N":
//			morseCode.appendString(Morse.N);
//			break;
//		case "O": 
//			morseCode.appendString(Morse.O);
//			break;
//		case "P":
//			morseCode.appendString(Morse.P);
//			break;
//		case "Q": 
//			morseCode.appendString(Morse.Q);
//			break;
//		case "R":
//			morseCode.appendString(Morse.R);
//			break;
//		case "S": 
//			morseCode.appendString(Morse.S);
//			break;
//		case "T":
//			morseCode.appendString(Morse.T);
//			break;
//		case "U": 
//			morseCode.appendString(Morse.U);
//			break;
//		case "V":
//			morseCode.appendString(Morse.V);
//			break;
//		case "W": 
//			morseCode.appendString(Morse.W);
//			break;
//		case "X":
//			morseCode.appendString(Morse.X);
//			break;
//		case "Y": 
//			morseCode.appendString(Morse.Y);
//			break;
//		case "Z":
//			morseCode.appendString(Morse.Z);
//			break;
//		case "0": 
//			morseCode.appendString(Morse.ZERO);
//			break;
//		case "1":
//			morseCode.appendString(Morse.ONE);
//			break;
//		case "2": 
//			morseCode.appendString(Morse.TWO);
//			break;
//		case "3":
//			morseCode.appendString(Morse.THREE);
//			break;
//		case "4": 
//			morseCode.appendString(Morse.FOUR);
//			break;
//		case "5":
//			morseCode.appendString(Morse.FIVE);
//			break;
//		case "6": 
//			morseCode.appendString(Morse.SIX);
//			break;
//		case "7":
//			morseCode.appendString(Morse.SEVEN);
//			break;
//		case "8": 
//			morseCode.appendString(Morse.EIGHT);
//			break;
//		case "9":
//			morseCode.appendString(Morse.NINE);
//			break;
//		case ".": 
//			morseCode.appendString(Morse.PERIOD);
//			break;
//		case ",":
//			morseCode.appendString(Morse.COMMA);
//			break;
//		case "?": 
//			morseCode.appendString(Morse.QUESTION);
//			break;
//		case " ": 
//			morseCode.appendString(Morse.SPACE);
//			break;
//		default:
//			System.out.println("Input not found");
//			break;
//		}
//		
//		
//		
//	}
