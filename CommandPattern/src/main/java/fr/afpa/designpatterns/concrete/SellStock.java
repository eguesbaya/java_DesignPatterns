package fr.afpa.designpatterns.concrete;

import fr.afpa.designpatterns.command.Order;
import fr.afpa.designpatterns.request.Stock;

public class SellStock implements Order{
	
	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
		
	}
	

}
