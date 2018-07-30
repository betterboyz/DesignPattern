package com.dsz.a_Creational.a_Factory.impl;

import com.dsz.a_Creational.a_Factory.Shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
