package com.dsz.a_Creational.b_AbstractFactory;

import com.dsz.a_Creational.b_AbstractFactory.color.Color;
import com.dsz.a_Creational.b_AbstractFactory.factory.AbstractFactory;
import com.dsz.a_Creational.b_AbstractFactory.shape.Shape;

/**
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
 *
 * @author dsz
 * @date 18/07/30
 */
public class AbstractFactoryPatternDemo {

  public static void main(String[] args) {

    //获取形状工厂
    AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

    //根据形状工厂，获取形状为 Circle 的对象,调用 Circle 的 draw 方法
    Shape shape1 = shapeFactory.getShape("circle");
    shape1.draw();
    //根据形状工厂，获取形状为 Rectangle  的对象,调用 Rectangle  的 draw 方法
    Shape shape2 = shapeFactory.getShape("rectangle");
    shape2.draw();
    //根据形状工厂，获取形状为 Square   的对象,调用 Square   的 draw 方法
    Shape shape3 = shapeFactory.getShape("square");
    shape3.draw();


    //获取颜色工厂
    AbstractFactory colorFactory = FactoryProducer.getFactory("color");

    //根据颜色工厂，获取颜色为 Red 的对象,调用 Red 的 fill 方法
    Color color1 = colorFactory.getColor("red");
    color1.fill();
    //根据颜色工厂，获取颜色为 Green  的对象,调用 Green  的 fill 方法
    Color color2 = colorFactory.getColor("green");
    color2.fill();
    //根据颜色工厂，获取颜色为 Blue  的对象,调用 Blue  的 fill 方法
    Color color3 = colorFactory.getColor("blue");
    color3.fill();
  }
}
