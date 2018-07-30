package com.dsz.a_Creational.d_Builder;

import com.dsz.a_Creational.d_Builder.item.BurgerChicken;
import com.dsz.a_Creational.d_Builder.item.BurgerVeg;
import com.dsz.a_Creational.d_Builder.item.ColdDrinkCoke;
import com.dsz.a_Creational.d_Builder.item.ColdDrinkPepsi;

/**
 * 套餐生成器
 *
 * @author dsz
 * @date 18/07/30
 */
public class MealBuilder {

  //套餐1
  public Meal prepareVegMeal() {
    Meal meal = new Meal();

    meal.addItem(new BurgerVeg());
    meal.addItem(new ColdDrinkCoke());

    return meal;
  }

  //套餐2
  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();

    meal.addItem(new BurgerChicken());
    meal.addItem(new ColdDrinkPepsi());

    return meal;
  }


}
