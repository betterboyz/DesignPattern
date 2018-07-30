package com.dsz.a_Creational.b_AbstractFactory.factory;

import com.dsz.a_Creational.b_AbstractFactory.color.Blue;
import com.dsz.a_Creational.b_AbstractFactory.color.Color;
import com.dsz.a_Creational.b_AbstractFactory.color.Green;
import com.dsz.a_Creational.b_AbstractFactory.color.Red;
import com.dsz.a_Creational.b_AbstractFactory.shape.Shape;

/**
 * @author dsz
 * @date 18/07/30
 */
public class ColorFactory extends AbstractFactory {
  @Override
  public Color getColor(String colorType) {
    if (colorType == null) {
      return null;
    }
    if (colorType.equalsIgnoreCase("red")) {
      return new Red();
    } else if (colorType.equalsIgnoreCase("green")) {
      return new Green();
    } else if (colorType.equalsIgnoreCase("blue")) {
      return new Blue();
    }

    return null;
  }

  @Override
  public Shape getShape(String shapeType) {
    return null;
  }
}
