package com.dsz.c_Behavioral.b_Command.order;

import com.dsz.c_Behavioral.b_Command.Stock;

/**
 * @author dsz
 * @date 18/08/03
 */
public class SellStock implements Order {
  private Stock abcStock;

  public SellStock(Stock abcStock) {
    this.abcStock = abcStock;
  }

  @Override
  public void execute() {
    abcStock.sell();
  }
}
