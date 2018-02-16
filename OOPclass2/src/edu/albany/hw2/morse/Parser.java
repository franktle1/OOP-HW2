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
	
	public void parseCmd(String[] args) {
		for(String word: args) {				
			if(word.compareTo(" ")==0) {
				morseCode.appendString(" "); }
			else { 
				convertStringToCode(word);					//this will past each argument word of word and add additional spacing if not available
				morseCode.appendString(" ");			
				}
		}//for
	}//end of method

	public void parseUserInput(String userInput) {
		
		//ask user input
		//store into String
		//parse String
	}
	
	//this allows the parser to return the morseCode Object
	public String getMorseCode() {
		return morseCode.getMorseCodeString();
	}
	
	//this will be parsing individual words
	public void convertStringToCode(String str) {
		//this is where the case statements go
		
	}
	
	
	
	
	
	
	
	
	

}
