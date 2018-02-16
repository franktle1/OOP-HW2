package edu.albany.hw2.morse;

public class MorseCodeGenerator {
	private String[] inputArray;
	private String inputString;
	private String outputString;
	private Parser parser;
	
	//this will return the output
	public MorseCodeGenerator(String[] inputArray) {
		this.inputArray = inputArray;
		outputString = new String("");} //points to nothing 
	
	public MorseCodeGenerator(String inputString) {
		this.inputString = inputString;
		outputString = new String("");} //points to nothing 
	
	private void callParser() {
		parser = new Parser();
	}
	
	public String getOutputString() {
		return outputString;}
	
	public void setOutputString(String outputString) {
		this.outputString = outputString;}
	
	
	
	
}
