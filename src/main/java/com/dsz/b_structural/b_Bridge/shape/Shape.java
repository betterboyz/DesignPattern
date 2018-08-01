package com.dsz.b_structural.b_Bridge.shape;

import com.dsz.b_structural.b_Bridge.drawAPI.DrawAPI;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape
 *
 * @author dsz
 * @date 18/08/01
 */
public abstract class Shape {
  protected DrawAPI drawAPI;

  protected Shape(DrawAPI drawAPI) {
    this.drawAPI = drawAPI;
  }

  public abstract void draw();
}
