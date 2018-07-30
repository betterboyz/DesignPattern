package com.dsz.a_Creational.e_Prototype.shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class Square extends Shape {
  public Square() {
    type = "Square";
  }

  @Override
  void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
