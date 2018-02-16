package edu.albany.hw2.stock;



public class Stock {
	enum Symbol {
		MSFT("MICROSOFT"),
		APPL("APPLE"),
		GOOG("GOOGLE"),
		AMZN("AMAZON"),
		T("AT&T");
		
		private final String strVal;
		
		Symbol(String str){
			this.strVal = str;
		}
		
		public String getStringValue() {
			return strVal;
		}
	}
	
	//this will hold the name of the stock and its value
	private Symbol symbol;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(Symbol symbol) {
		this.symbol = symbol;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent(){
		return (currentPrice - previousClosingPrice)/previousClosingPrice;
				
	}

}
