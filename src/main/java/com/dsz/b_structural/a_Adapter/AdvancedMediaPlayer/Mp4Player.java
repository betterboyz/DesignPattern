package com.dsz.b_structural.a_Adapter.AdvancedMediaPlayer;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 *
 * @author dsz
 * @date 18/08/01
 */
public class Mp4Player implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    //什么也不做
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }
}
