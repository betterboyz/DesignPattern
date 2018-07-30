package com.dsz.a_Creational.b_AbstractFactory.factory;

import com.dsz.a_Creational.b_AbstractFactory.color.Color;
import com.dsz.a_Creational.b_AbstractFactory.shape.Circle;
import com.dsz.a_Creational.b_AbstractFactory.shape.Rectangle;
import com.dsz.a_Creational.b_AbstractFactory.shape.Shape;
import com.dsz.a_Creational.b_AbstractFactory.shape.Square;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 *
 * @author dsz
 * @date 18/07/30
 */
public class ShapeFactory extends AbstractFactory {

  @Override
  public Color getColor(String colorType) {
    return null;
  }

  @Override
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("circle")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    } else if (shapeType.equalsIgnoreCase("square")) {
      return new Square();
    }
    return null;
  }
}
