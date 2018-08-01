package com.dsz.b_structural.e_Decorator.shapeDecorator;

import com.dsz.b_structural.e_Decorator.shape.Shape;

/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类
 *
 * @author dsz
 * @date 18/08/01
 */
public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder(decoratedShape);
  }

  private void setRedBorder(Shape decoratedShape) {
    System.out.println("Border Color: Red");
  }
}
