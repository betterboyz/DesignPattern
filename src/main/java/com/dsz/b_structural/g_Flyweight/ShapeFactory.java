package com.dsz.b_structural.g_Flyweight;

import com.dsz.b_structural.g_Flyweight.shape.Circle;
import com.dsz.b_structural.g_Flyweight.shape.Shape;

import java.util.HashMap;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象
 *
 * @author dsz
 * @date 18/08/01
 */
public class ShapeFactory {
  private static final HashMap<String, Shape> circleMap = new HashMap<>();

  public static Shape getCircle(String color) {
    Circle circle = (Circle) circleMap.get(color);

    if (circle == null) {
      circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("Creating circle of color : " + color);
    }
    return circle;
  }
}
