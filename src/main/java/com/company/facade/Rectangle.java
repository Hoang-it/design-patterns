package com.company.facade;

import com.company.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Rectangle");
    }
}
