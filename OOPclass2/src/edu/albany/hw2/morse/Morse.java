package edu.albany.hw2.morse;

public enum Morse {
	//Numbers
	ZERO("0", "-----"), ONE("1", ".----"), TWO("2","..---"), THREE("3", "...--"),
	FOUR("4", "....-"), FIVE("5","....."), SIX("6","-...."), SEVEN("7","--..."),
	EIGHT("8","---.."), NINE("9","----."),
	
	//Special characters
	SPACE(" ", " "), COMMA(",", "--..--"), PERIOD(".",".-.-.-"), QUESTION("?", "..--.."),
	
	//Letters
	A("A", ".-"), B("B", "-..."), C("C", "-.-."), D("D", "-.."), E("E", "."),
	F("F", "..-."), G("G", "--."), H("H", "...."), I("I", ".."), J("J", ".---"),
	K("K","-.-"), L("L",".-.."), M("M","--"), N("N","-."), O("O","---"),
	P("P", ".--."), Q("Q", "--.-"), R("R", ".-."), S("S", "..."), T("T","-"),
	U("U","..-"), V("V","...-"), W("W",".--"), X("X","-..-"), Y("Y", "-.--"),
	Z("Z", "--..");
	
	//Data Fields
	private String strValue;
	private String strCode;
	
	Morse(String strValue, String strCode) {
		this.strValue = strValue;
		this.strCode = strCode;}
	
	public String getStrValue() {
		return strValue;
	}
	public String getStrCode() {
		return strCode;
	}
	
	
	
	
	
}
