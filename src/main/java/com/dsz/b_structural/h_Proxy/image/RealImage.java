package com.dsz.b_structural.h_Proxy.image;

/**
 * @author dsz
 * @date 18/08/01
 */
public class RealImage implements Image {
  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  private void loadFromDisk(String fileName) {
    System.out.println("Loading " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + fileName);
  }
}
