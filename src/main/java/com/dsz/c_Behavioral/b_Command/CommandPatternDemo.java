package com.dsz.c_Behavioral.b_Command;

import com.dsz.c_Behavioral.b_Command.order.BuyStock;
import com.dsz.c_Behavioral.b_Command.order.SellStock;

/**
 * 使用 Broker 类来接受并执行命令
 *
 * @author dsz
 * @date 18/08/03
 */
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
