package com.company.abstractfactory;

import com.company.enums.TypeShape;
import com.company.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if (TypeShape.SQUARE.name().equals(type)) return new Square();
        if (TypeShape.RECTANGLE.name().equals(type)) return new Rectangle();
        return null;
    }
}
