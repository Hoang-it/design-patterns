package com.company.bridge;

import com.company.interfaces.DrawApi;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red Circle");
    }
}
