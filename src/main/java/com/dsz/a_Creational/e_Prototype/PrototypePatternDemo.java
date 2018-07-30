package com.dsz.a_Creational.e_Prototype;

import com.dsz.a_Creational.e_Prototype.shape.Shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class PrototypePatternDemo {
  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape clonedShape1 = ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape1.getType());

    Shape clonedShape2 = ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());

    Shape clonedShape3 = ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());
  }
}
