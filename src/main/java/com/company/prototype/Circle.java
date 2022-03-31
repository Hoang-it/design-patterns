package com.company.prototype;

import com.company.enums.TypeShape;

public class Circle extends Shape{
    public Circle(){
        this.type = TypeShape.CIRCLE.name();
    }
    @Override
    void draw() {
        System.out.println(this.getClass().getName());
    }
}
