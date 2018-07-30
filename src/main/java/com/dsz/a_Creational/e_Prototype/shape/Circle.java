package com.dsz.a_Creational.e_Prototype.shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class Circle extends Shape {
  public Circle() {
    type = "Circle";
  }

  @Override
  void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
