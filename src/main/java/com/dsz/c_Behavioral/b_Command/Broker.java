package com.dsz.c_Behavioral.b_Command;

import com.dsz.c_Behavioral.b_Command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建命令调用类
 *
 * @author dsz
 * @date 18/08/03
 */
public class Broker {
  private List<Order> orderList = new ArrayList<>();

  public void takeOrder(Order order) {
    orderList.add(order);
  }

  public void placeOrders() {
    for (Order order : orderList) {
      order.execute();
    }
    orderList.clear();
  }
}
