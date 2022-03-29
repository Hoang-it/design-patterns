package com.company.abstractfactory;

import com.company.interfaces.Shape;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
