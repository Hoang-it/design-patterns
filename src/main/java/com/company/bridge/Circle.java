package com.company.bridge;

import com.company.interfaces.DrawApi;

public class Circle extends Shape{
    private int x, y, radius;
    public Circle(int radius, int x, int y, DrawApi drawApi){
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        this.drawApi.drawCircle(this.radius, this.x, this.y);
    }
}
