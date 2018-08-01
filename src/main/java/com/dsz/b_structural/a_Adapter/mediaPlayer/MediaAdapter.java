package com.dsz.b_structural.a_Adapter.mediaPlayer;

import com.dsz.b_structural.a_Adapter.advancedMediaPlayer.AdvancedMediaPlayer;
import com.dsz.b_structural.a_Adapter.advancedMediaPlayer.Mp4Player;
import com.dsz.b_structural.a_Adapter.advancedMediaPlayer.VlcPlayer;

/**
 * 创建实现了 MediaPlayer 接口的适配器类
 *
 * @author dsz
 * @date 18/08/01
 */
public class MediaAdapter implements MediaPlayer {

  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer.playMp4(fileName);
    }
  }
}
