package com.dsz.b_structural.a_Adapter.advancedMediaPlayer;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 *
 * @author dsz
 * @date 18/08/01
 */
public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
    //什么也不做
  }
}
