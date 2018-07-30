package com.dsz.a_Creational.d_Builder.item;

import com.dsz.a_Creational.d_Builder.packing.Packing;
import com.dsz.a_Creational.d_Builder.packing.Wrapper;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 *
 * @author dsz
 * @date 18/07/30
 */
public abstract class Burger implements Item {


  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
