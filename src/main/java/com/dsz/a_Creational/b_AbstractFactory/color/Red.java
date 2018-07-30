package com.dsz.a_Creational.b_AbstractFactory.color;

/**
 * @author dsz
 * @date 18/07/30
 */
public class Red implements Color {
  @Override
  public void fill() {
    System.out.println("Inside Red::fill() method.");
  }
}
