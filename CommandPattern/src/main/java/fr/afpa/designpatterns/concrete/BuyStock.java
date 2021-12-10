package fr.afpa.designpatterns.concrete;

import fr.afpa.designpatterns.command.Order;
import fr.afpa.designpatterns.request.Stock;

public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
