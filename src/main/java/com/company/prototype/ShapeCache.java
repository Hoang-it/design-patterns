package com.company.prototype;

import java.util.Hashtable;

public class ShapeCache {
    public static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException{
        Shape cached = shapeMap.get(shapeId);
        return (Shape) cached.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        circle.setId("1");
        square.setId("2");
        rectangle.setId("3");

        shapeMap.put(circle.getId(), circle);
        shapeMap.put(square.getId(), square);
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
