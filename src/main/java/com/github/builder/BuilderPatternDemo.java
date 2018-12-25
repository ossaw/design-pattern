package com.github.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.propareVegMeal();
        vegMeal.showItems();
        vegMeal.showPrice();

        println();

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        chickenMeal.showItems();
        chickenMeal.showPrice();
    }

    public static void println() {
        System.out.println();
    };

}
