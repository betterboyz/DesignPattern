package com.dsz.a_Creational.a_Factory;

import com.dsz.a_Creational.a_Factory.shape.Shape;

/**
 * 使用该工厂，通过传递类型信息来获取实体类的对象
 *
 * @author dsz
 * @date 18/07/30
 */
public class FactoryPatternDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    //获取 Circle 的对象，并调用它的 draw 方法
    Shape shape1 = shapeFactory.getShape("circle");
    //调用 Circle 的 draw 方法
    shape1.draw();

    //获取 Rectangle 的对象，并调用它的 draw 方法
    Shape shape2 = shapeFactory.getShape("rectangle");
    //调用 Rectangle 的 draw 方法
    shape2.draw();

    //获取 Square 的对象，并调用它的 draw 方法
    Shape shape3 = shapeFactory.getShape("square");
    //调用 Square 的 draw 方法
    shape3.draw();


  }
}
