package com.dsz.b_structural.c_Filter.criteria;

import com.dsz.b_structural.c_Filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dsz
 * @date 18/08/01
 */
public class CriteriaSingle implements Criteria {
  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> singlePerson = new ArrayList<>();
    for (Person person : persons) {
      //检测条件
      if (person.getMaritalStatus().equalsIgnoreCase("single")) {
        singlePerson.add(person);
      }
    }
    return singlePerson;
  }
}
