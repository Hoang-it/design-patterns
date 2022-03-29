package com.company.builder;

import com.company.interfaces.Item;
import com.company.interfaces.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
