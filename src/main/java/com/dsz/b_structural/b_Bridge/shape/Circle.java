package com.dsz.b_structural.b_Bridge.shape;

import com.dsz.b_structural.b_Bridge.drawAPI.DrawAPI;

/**
 * @author dsz
 * @date 18/08/01
 */
public class Circle extends Shape {
  private int x, y, radius;

  public Circle(int x, int y, int radius, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    drawAPI.drawCircle(radius, x, y);

  }
}
