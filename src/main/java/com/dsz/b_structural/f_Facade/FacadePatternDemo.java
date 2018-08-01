package com.dsz.b_structural.f_Facade;

/**
 * 使用该外观类画出各种类型的形状
 *
 * @author dsz
 * @date 18/08/01
 */
public class FacadePatternDemo {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
