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
		codes = new MorseCode();}
	
	//this will pass each argument word for word and add additional spacing for sentences
	//ie cmdline: ./filename There is a cute bunny--> mmm<space>mmm<space><>....
	public void parseCmd(String[] args) {
		for(String word: args) {				
			if(word.compareTo(" ")==0) {	
				sb.append(" ");}
			else { 
				convertStringToCode(word);					
				sb.append(" ");	}			
		}//for
	}//end of method

	public void parseUserInput(String userInput) {
			convertStringToCode(userInput); }
	
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
				continue;}
			if(codeMap.get(input) != null) {
				sb.append(codeMap.get(input));}
			else
				System.out.println(input + " does not exist in Morse Code mapping yet.");
		}//for
	}//convertString method


} //end of Class

