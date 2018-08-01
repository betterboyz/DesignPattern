package com.dsz.b_structural.b_Bridge.drawAPI;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类
 *
 * @author dsz
 * @date 18/08/01
 */
public class GreenCircle implements DrawAPI {
  @Override
  public void drawCircle(int radius, int x, int y) {
    System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
  }
}
