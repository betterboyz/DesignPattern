package com.dsz.a_Creational.c_Singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * @author dsz
 * @date 18/07/30
 */

/**
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：较复杂
 * <p>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class SingletonDCL {
  private volatile static SingletonDCL instance = null;

  private SingletonDCL() {
  }

  public static SingletonDCL getInstance() {
    //先检查实例是否存在，如果不存在才进入下面的同步块
    if (instance == null) {
      //同步块，线程安全的创建实例
      synchronized (SingletonDCL.class) {
        //再次检查实例是否存在，如果不存在才真正的创建实例
        if (instance == null) {
          instance = new SingletonDCL();
        }
      }
    }
    return instance;
  }
}
