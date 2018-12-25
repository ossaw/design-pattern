package com.github.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeCache {

    private static final Map<String, Shape> SHAPE_MAP = new ConcurrentHashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        circle.setType("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        square.setType("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        rectangle.setType("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}
