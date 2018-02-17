package edu.albany.hw2.morse;

public class MorseCodeGenerator {
	private String[] inputArray;
	private String inputString;
	private String outputString;
	private Parser parser;
	
	//this class will return the output
	public MorseCodeGenerator(String[] inputArray) {
		this.inputArray = inputArray;
		outputString = new String("");
		callParser(); //sets the strings
		} 
	
	public MorseCodeGenerator(String inputString) {
		this.inputString = inputString;
		outputString = new String("");
		callParser(); //sets the strings
		} 
	
	private void callParser() {
		parser = new Parser();
		//parse input String
		if(inputArray == null) {
			parser.parseUserInput(inputString);
			setOutputString(parser.getMorseCode());}
		//parse array
		else {
			parser.parseCmd(inputArray);
			setOutputString(parser.getMorseCode());}	
	}
	
	public String getOutputString() {
		return outputString;}
	
	private void setOutputString(String outputString) {
		this.outputString = outputString;}
	
	
	
	
}
