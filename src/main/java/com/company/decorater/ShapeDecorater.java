package com.company.decorater;

import com.company.interfaces.Shape;

public abstract class ShapeDecorater implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorater(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
