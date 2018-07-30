package com.dsz.a_Creational.d_Builder.item;

import com.dsz.a_Creational.d_Builder.packing.Packing;

/**
 * 创建一个表示食物条目的接口。
 *
 * @author dsz
 * @date 18/07/30
 */
public interface Item {
  //名称
  public String name();

  //食物包装
  public Packing packing();

  //价格
  public float price();
}
