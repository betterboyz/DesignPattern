package com.dsz.b_structural.c_Filter;

/**
 * 创建一个类，在该类上应用标准
 *
 * @author dsz
 * @date 18/08/01
 */
public class Person {
  private String name;
  private String gender;
  private String maritalStatus;

  public Person(String name, String gender, String maritalStatus) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }
}
