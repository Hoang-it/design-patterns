package com.company.abstractfactory;

import com.company.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
