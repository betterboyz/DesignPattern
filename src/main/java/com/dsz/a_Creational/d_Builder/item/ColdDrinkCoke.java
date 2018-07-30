package com.dsz.a_Creational.d_Builder.item;

/**
 * 创建扩展了 ColdDrink 的实体类
 *
 * @author dsz
 * @date 18/07/30
 */
public class ColdDrinkCoke extends ColdDrink {
  @Override
  public String name() {
    return "Coke ColdDrink";
  }

  @Override
  public float price() {
    return 30.0f;
  }
}
