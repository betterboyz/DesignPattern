package com.dsz.b_structural.e_Decorator;

import com.dsz.b_structural.e_Decorator.shape.Circle;
import com.dsz.b_structural.e_Decorator.shape.Rectangle;
import com.dsz.b_structural.e_Decorator.shape.Shape;
import com.dsz.b_structural.e_Decorator.shapeDecorator.RedShapeDecorator;

/**
 * 使用 RedShapeDecorator 来装饰 Shape 对象
 *
 * @author dsz
 * @date 18/08/01
 */
public class DecoratorPatternDemo {
  public static void main(String[] args) {

    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());

    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nRectangle of red border");
    redRectangle.draw();
  }
}
