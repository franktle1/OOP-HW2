package edu.albany.hw2.morse;

public class MorseCode {
	private String morseCode;
	
	public MorseCode() {
		morseCode = new String("");}
	
	public void appendString(String str) {
		this.morseCode += str;}
	
	public String getMorseCode() {
		return morseCode;
	}
	
	
	
}
