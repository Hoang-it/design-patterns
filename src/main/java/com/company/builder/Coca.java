package com.company.builder;

import com.company.interfaces.Packing;

public class Coca extends ColdDrink{
    @Override
    public String name() {
        return "Coca";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
