package com.company.decorater;

import com.company.interfaces.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedShapeDecoratorTest {

    @Test
    void draw() {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}