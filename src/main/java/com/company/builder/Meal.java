package com.company.builder;

import com.company.interfaces.Item;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public boolean addItem(Item item){
        items.add(item);
        return true;
    }
    public float cost(){
        float cost = 0.0f;
        for (Item item: items
             ) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item: items
        ) {
            System.out.println("Item: " + item.name() + ", Packing:  " + item.packing().name() + " Price: " + item.price());
        }
    }

}
