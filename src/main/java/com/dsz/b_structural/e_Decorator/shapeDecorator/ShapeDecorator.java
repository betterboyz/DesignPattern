package com.dsz.b_structural.e_Decorator.shapeDecorator;

import com.dsz.b_structural.e_Decorator.shape.Shape;

/**
 * 创建实现了 Shape 接口的抽象装饰类
 *
 * @author dsz
 * @date 18/08/01
 */
public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public void draw() {
    decoratedShape.draw();
  }
}
