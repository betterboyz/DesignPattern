package com.dsz.a_Creational.d_Builder;

/**
 * @author dsz
 * @date 18/07/30
 */
public class BuilderPatternDemo {
  public static void main(String[] aregs) {
    MealBuilder mealBuilder = new MealBuilder();

    //生成套餐1
    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal 套餐");
    vegMeal.showItems();
    System.out.println("Total Cost: " + vegMeal.getCost());

    //生成套餐2
    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("\n\nNon-Veg Meal 套餐");
    nonVegMeal.showItems();
    System.out.println("Total Cost: " + nonVegMeal.getCost());
  }
}
