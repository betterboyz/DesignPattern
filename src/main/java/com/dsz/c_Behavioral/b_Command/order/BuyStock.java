package com.dsz.c_Behavioral.b_Command.order;

import com.dsz.c_Behavioral.b_Command.Stock;

/**
 * 创建实现了 Order 接口的实体类
 *
 * @author dsz
 * @date 18/08/03
 */
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
