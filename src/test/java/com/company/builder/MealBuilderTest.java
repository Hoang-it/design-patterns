package com.company.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealBuilderTest {

    @Test
    void buildVegMeal() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.buildVegMeal();
        meal.showItems();
        System.out.println("Total: " + meal.cost());
    }

    @Test
    void buildNonVegMeal() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.buildNonVegMeal();
        meal.showItems();
        System.out.println("Total: " + meal.cost());
    }
}