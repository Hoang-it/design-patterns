package com.company.prototype;

import com.company.enums.TypeShape;

public class Rectangle extends Shape{
    public Rectangle(){
        this.type = TypeShape.RECTANGLE.name();
    }
    @Override
    void draw() {
        System.out.println(this.getClass().getName());
    }
}
