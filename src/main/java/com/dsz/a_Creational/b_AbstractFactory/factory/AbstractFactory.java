package com.dsz.a_Creational.b_AbstractFactory.factory;

import com.dsz.a_Creational.b_AbstractFactory.color.Color;
import com.dsz.a_Creational.b_AbstractFactory.shape.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 *
 * @author dsz
 * @date 18/07/30
 */
public abstract class AbstractFactory {

  public abstract Color getColor(String colorType);

  public abstract Shape getShape(String shapeType);
}
