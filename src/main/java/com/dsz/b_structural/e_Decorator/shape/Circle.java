package com.dsz.b_structural.e_Decorator.shape;

/**
 * 创建实现接口的实体类
 *
 * @author dsz
 * @date 18/08/01
 */
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Shape: Circle");
  }
}
