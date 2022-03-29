package com.company.factory;

import com.company.enums.TypeShape;
import com.company.interfaces.Shape;

public class ShapeFactory {
    public Shape create(String name){
        if (TypeShape.CIRCLE.name().equals(name)) return new Circle();
        if (TypeShape.RECTANGLE.name().equals(name)) return new Rectangle();
        if (TypeShape.SQUARE.name().equals(name)) return new Square();
        return null;
    }
}
