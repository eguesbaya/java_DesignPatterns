package fr.afpa.designpatterns.execute;

import fr.afpa.designpatterns.concrete.BuyStock;
import fr.afpa.designpatterns.concrete.SellStock;
import fr.afpa.designpatterns.invoker.Broker;
import fr.afpa.designpatterns.request.Stock;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

	}

}
