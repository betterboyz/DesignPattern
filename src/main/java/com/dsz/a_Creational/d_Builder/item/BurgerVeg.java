package com.dsz.a_Creational.d_Builder.item;

/**
 * 创建扩展了 Burger 的实体类
 *
 * @author dsz
 * @date 18/07/30
 */
public class BurgerVeg extends Burger {
  @Override
  public String name() {
    return "Veg Burger";
  }

  @Override
  public float price() {
    return 25.0f;
  }
}
