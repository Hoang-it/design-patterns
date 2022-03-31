package com.company.bridge;

import com.company.interfaces.DrawApi;

public abstract class Shape {
    public DrawApi drawApi;

    public Shape(DrawApi _drawApi){
        this.drawApi = _drawApi;
    }

    public abstract void draw();
}
