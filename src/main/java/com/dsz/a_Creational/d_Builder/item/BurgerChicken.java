package com.dsz.a_Creational.d_Builder.item;

/**
 * 创建扩展了 Burger 的实体类
 *
 * @author dsz
 * @date 18/07/30
 */
public class BurgerChicken extends Burger {
  @Override
  public String name() {
    return "Chicken Burger";
  }

  @Override
  public float price() {
    return 50.5f;
  }
}
