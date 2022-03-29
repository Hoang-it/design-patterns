package com.company.builder;

import com.company.interfaces.Packing;

public class Bottle implements Packing {

    @Override
    public String name() {
        return "Bottle";
    }
}
