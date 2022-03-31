package com.company.prototype;

import com.company.enums.TypeShape;

public class Square extends Shape{
    public Square(){
        this.type = TypeShape.SQUARE.name();
    }
    @Override
    void draw() {
        System.out.println(this.getClass().getName());
    }
}
