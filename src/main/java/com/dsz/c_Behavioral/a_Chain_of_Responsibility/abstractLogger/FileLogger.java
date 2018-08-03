package com.dsz.c_Behavioral.a_Chain_of_Responsibility.abstractLogger;

/**
 * 创建扩展了该记录器类的实体类
 *
 * @author dsz
 * @date 18/08/03
 */
public class FileLogger extends AbstractLogger {
  public FileLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("File::Logger: " + message);
  }
}
