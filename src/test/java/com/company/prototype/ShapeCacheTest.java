package com.company.prototype;

import com.company.enums.TypeShape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCacheTest {

    @Test
    void getShape() {
        ShapeCache.loadCache();
        try {
            Shape cloneShape = ShapeCache.getShape("1");
            Shape cloneShape2 = ShapeCache.getShape("2");
            Shape cloneShape3 = ShapeCache.getShape("3");

            cloneShape.draw();
            cloneShape2.draw();
            cloneShape3.draw();

            assertEquals(cloneShape.getType(), TypeShape.CIRCLE.name());
            assertEquals(cloneShape2.getType(), TypeShape.SQUARE.name());
            assertEquals(cloneShape3.getType(), TypeShape.RECTANGLE.name());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}