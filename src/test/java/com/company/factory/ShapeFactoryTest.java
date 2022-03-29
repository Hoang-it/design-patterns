package com.company.factory;

import com.company.enums.TypeShape;
import com.company.interfaces.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void create() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.create(TypeShape.CIRCLE.name());
        Shape shape2 = shapeFactory.create(TypeShape.RECTANGLE.name());
        Shape shape3 = shapeFactory.create(TypeShape.SQUARE.name());
        Shape shape4 = shapeFactory.create("null");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        assertNull(shape4);
    }
}