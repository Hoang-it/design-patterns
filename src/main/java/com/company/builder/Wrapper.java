package com.company.builder;

import com.company.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String name() {
        return "Wrapper";
    }
}
