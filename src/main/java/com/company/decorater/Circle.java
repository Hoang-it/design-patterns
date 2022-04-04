package com.company.decorater;

import com.company.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
