package com.company.abstractfactory;

import com.company.enums.TypeShape;
import com.company.interfaces.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProducerTest {

    @Test
    void factory() {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory roundFactory = producer.factory(true);
        Shape shape1 = roundFactory.getShape(TypeShape.ROUNDED_RECTANGLE.name());
        Shape shape2 = roundFactory.getShape(TypeShape.ROUNDED_SQUARE.name());

        AbstractFactory shapeFactory = producer.factory(false);
        Shape shape3 = shapeFactory.getShape(TypeShape.SQUARE.name());
        Shape shape4 = shapeFactory.getShape(TypeShape.RECTANGLE.name());

        Shape shape5 = shapeFactory.getShape(TypeShape.ROUNDED_SQUARE.name());
        Shape shape6 = roundFactory.getShape(TypeShape.RECTANGLE.name());

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();

        assertNull(shape5);
        assertNull(shape6);

    }
}