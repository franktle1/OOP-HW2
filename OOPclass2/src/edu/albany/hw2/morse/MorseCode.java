package edu.albany.hw2.morse;

public class MorseCode {
	private StringBuffer sb;
	
	public MorseCode() {
		sb = new StringBuffer("");
	}
	
	public void appendString(Morse m) {
		sb.append(m.getStrCode());
	}
	
	public String getMorseCodeString() {
		return sb.toString();
	}
	
	
	
}
