package com.dsz.b_structural.h_Proxy.image;

/**
 * @author dsz
 * @date 18/08/01
 */
public class ProxyImage implements Image {

  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    realImage.display();

  }
}
