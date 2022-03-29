package com.company.builder;

import com.company.interfaces.Item;
import com.company.interfaces.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
