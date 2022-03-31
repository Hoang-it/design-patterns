package com.company.bridge;

import com.company.interfaces.DrawApi;

public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Green Circle");
    }
}
