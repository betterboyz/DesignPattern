package com.dsz.b_structural.f_Facade;


import com.dsz.b_structural.f_Facade.shape.Circle;
import com.dsz.b_structural.f_Facade.shape.Rectangle;
import com.dsz.b_structural.f_Facade.shape.Shape;
import com.dsz.b_structural.f_Facade.shape.Square;

/**
 * 创建一个外观类
 *
 * @author dsz
 * @date 18/08/01
 */
public class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker() {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
  }

  public void drawCircle() {
    circle.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawSquare() {
    square.draw();
  }
}
