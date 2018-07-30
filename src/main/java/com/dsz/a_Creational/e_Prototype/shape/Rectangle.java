package com.dsz.a_Creational.e_Prototype.shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class Rectangle extends Shape {
  public Rectangle() {
    type = "Rectangle";
  }

  @Override
  void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
