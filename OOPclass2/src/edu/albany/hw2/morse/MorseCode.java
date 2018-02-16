package edu.albany.hw2.morse;

public class MorseCode {
	private StringBuffer sb;
	
	public MorseCode() {
		sb = new StringBuffer("");
	}
	
	public void appendString(String str) {
		sb.append(str);
	}
	
	public String getMorseCodeString() {
		return sb.toString();
	}
	
	
	
}
