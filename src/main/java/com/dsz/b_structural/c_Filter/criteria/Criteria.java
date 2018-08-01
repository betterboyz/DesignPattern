package com.dsz.b_structural.c_Filter.criteria;

import com.dsz.b_structural.c_Filter.Person;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口
 *
 * @author dsz
 * @date 18/08/01
 */
public interface Criteria {
  public List<Person> meetCriteria(List<Person> persons);
}
