package edu.albany.hw2.morse;


//the purpose of this class is to break down the user input into easy to handle strings
//command line args may or may not contain space; after every word, you need to add a space
		//Example input ./javafile Hello " " World.		------> mmmm   mmmm
		//Example input ./javafile Hello World			------> mmmm mmmm
public class Parser {
	private String stringToParse;
	private MorseCode morseCode;
	
	
	public Parser() {
		this.morseCode = new MorseCode();
	}
	
	public static void parseCmd(String[] args) {
		for(String x: args) {
			
		}
	}

	public static void parseUserInput(String userInput) {
		
		//ask user input
		//store into String
		//parse String
	}
	
	//this allows the parser to return the morseCode Object
	public MorseCode getMorseCode() {
		return morseCode;
	}
	
	public void convertString(String str) {
		
	}
	
	
	
	
	
	
	
	
	

}
