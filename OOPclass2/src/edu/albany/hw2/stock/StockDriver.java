package edu.albany.hw2.stock;

import edu.albany.hw2.stock.Stock.Symbol;

public class StockDriver {

	public static void main(String[] args) {
		Stock ms = new Stock(Symbol.GOOG);
		ms.setPreviousClosingPrice(58.9);
		ms.setCurrentPrice(59);
		System.out.println(ms.getChangePercent());
		
		Stock apl = new Stock(Symbol.APPL);
		ms.setPreviousClosingPrice(100);
		ms.setCurrentPrice(90);
		System.out.println(ms.getChangePercent());

	}

}
