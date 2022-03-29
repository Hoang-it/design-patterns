package com.company.builder;

public class MealBuilder {

    public Meal buildVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

    public Meal buildNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBug());
        meal.addItem(new Coca());

        return meal;
    }
}
