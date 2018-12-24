package com.github.factory.factory;

import com.github.factory.product.Circle;
import com.github.factory.product.Rectangle;
import com.github.factory.product.Shape;
import com.github.factory.product.Square;

public class ShapeFactory {
    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String SQUARE = "square";

    public static Shape getShape(String type) {
        if (type == null)
            return null;
        if (CIRCLE.equals(type))
            return new Circle();
        else if (SQUARE.equals(type))
            return new Square();
        else if (RECTANGLE.equals(type))
            return new Rectangle();
        return null;
    }

    public static <T extends Shape> T getShape(Class<T> clazz)
            throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}
