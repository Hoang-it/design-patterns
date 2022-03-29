package com.company.abstractfactory;

import com.company.enums.TypeShape;
import com.company.interfaces.Shape;

public class RoundedFactory extends AbstractFactory{
    @Override
    Shape getShape(String type) {
        if (TypeShape.ROUNDED_RECTANGLE.name().equals(type)) return new RoundedRectangle();
        if (TypeShape.ROUNDED_SQUARE.name().equals(type)) return new RoundedSquare();
        return null;
    }
}
