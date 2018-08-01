package com.dsz.b_structural.b_Bridge;

import com.dsz.b_structural.b_Bridge.drawAPI.GreenCircle;
import com.dsz.b_structural.b_Bridge.drawAPI.RedCircle;
import com.dsz.b_structural.b_Bridge.shape.Circle;
import com.dsz.b_structural.b_Bridge.shape.Shape;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆
 *
 * @author dsz
 * @date 18/08/01
 */
public class BridgePatternDemo {
  public static void main(String[] args) {
    Shape redCircle = new Circle(100, 100, 0, new RedCircle());
    Shape greenCircle = new Circle(100, 100, 0, new GreenCircle());

    redCircle.draw();
    greenCircle.draw();
  }
}
