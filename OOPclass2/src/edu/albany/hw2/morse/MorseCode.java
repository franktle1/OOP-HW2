package edu.albany.hw2.morse;

import java.util.HashMap;


public class MorseCode {
	private HashMap<String, String> codeMap; 
	
	public MorseCode() {
		codeMap = new HashMap<String, String>();
		//Numbers
		codeMap.put("0", "-----"); codeMap.put("1", ".----"); codeMap.put("2","..---"); codeMap.put("3", "...--");
		codeMap.put("4", "....-"); codeMap.put("5","....."); codeMap.put("6","-...."); codeMap.put("7","--...");
		codeMap.put("8","---.."); codeMap.put("9","----.");
		
		//Special characters
		codeMap.put(" ", " "); codeMap.put(",", "--..--"); codeMap.put(".",".-.-.-"); codeMap.put("?", "..--..");
		
		//Letters
		codeMap.put("A", ".-"); codeMap.put("B", "-..."); codeMap.put("C", "-.-."); codeMap.put("D", "-..");
		codeMap.put("E", "."); codeMap.put("F", "..-."); codeMap.put("G", "--."); codeMap.put("H", "....");
		codeMap.put("I", ".."); codeMap.put("J", ".---");codeMap.put("K","-.-"); codeMap.put("L",".-..");
		codeMap.put("M","--"); codeMap.put("N","-."); codeMap.put("O","---"); codeMap.put("P", ".--."); 
		codeMap.put("Q", "--.-");codeMap.put("R", ".-."); codeMap.put("S", "..."); codeMap.put("T","-");
		codeMap.put("U","..-"); codeMap.put("V","...-"); codeMap.put("W",".--"); codeMap.put("X","-..-");
		codeMap.put("Y", "-.--");codeMap.put("Z", "--..");		
	}
	
	public HashMap<String,String> getCodeMap(){
		return codeMap;
	}
		
}

