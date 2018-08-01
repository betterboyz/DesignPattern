package com.dsz.a_Creational.c_Singleton;

/**
 * @author dsz
 * @date 18/07/30
 */
public class SingletonPatternDemo {

  public static void main(String[] args) {
    //不合法的构造函数
    //编译时错误：构造函数 SingleObject() 是不可见的
    //SingleObject object = new SingleObject();

    //获取唯一可用的对象
    SingleObject object = SingleObject.getInstance();

    //显示消息
    object.showMessage();

    SingleObject object1 = SingleObject.getInstance();


  }
}
