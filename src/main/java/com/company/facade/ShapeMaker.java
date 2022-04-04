package com.company.facade;

import com.company.interfaces.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape rec;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rec = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rec.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
