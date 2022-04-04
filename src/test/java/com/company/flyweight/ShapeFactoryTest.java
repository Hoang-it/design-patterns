package com.company.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    void getCircle() {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private int getRandomY() {
        return (int)(Math.random()*100);
    }
}