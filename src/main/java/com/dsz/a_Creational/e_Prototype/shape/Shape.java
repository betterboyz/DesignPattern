package com.dsz.a_Creational.e_Prototype.shape;

/**
 * 创建一个实现了 Clonable 接口的抽象类。
 *
 * @author dsz
 * @date 18/07/30
 */
public abstract class Shape implements Cloneable {
  private String id;
  protected String type;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  //抽象方法
  abstract void draw();

  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
