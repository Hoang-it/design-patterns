package com.company.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void draw() {
        Shape redCircle = new Circle(10,10,10, new RedCircle());
        Shape greenCircle = new Circle(10,10,10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}