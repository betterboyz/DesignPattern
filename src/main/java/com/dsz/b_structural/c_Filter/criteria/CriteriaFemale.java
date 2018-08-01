package com.dsz.b_structural.c_Filter.criteria;

import com.dsz.b_structural.c_Filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dsz
 * @date 18/08/01
 */
public class CriteriaFemale implements Criteria {
  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> femalePersons = new ArrayList<>();
    for (Person person : persons) {
      //检测条件
      if (person.getGender().equalsIgnoreCase("female")) {
        femalePersons.add(person);
      }
    }

    return femalePersons;
  }
}
