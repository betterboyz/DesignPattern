package com.dsz.c_Behavioral.b_Command;

/**
 * 创建一个请求类
 *
 * @author dsz
 * @date 18/08/03
 */
public class Stock {

  private String name = "ABC";
  private int quantity = 10;

  public void buy() {
    System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
  }

  public void sell() {
    System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
  }
}
