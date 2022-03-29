package com.company.builder;

import com.company.interfaces.Packing;

public class VegBug extends Burger{
    @Override
    public String name(){
        return "VegBug";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
