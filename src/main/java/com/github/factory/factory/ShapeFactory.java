package com.github.factory.factory;

import com.github.factory.shape.Circle;
import com.github.factory.shape.Rectangle;
import com.github.factory.shape.Shape;
import com.github.factory.shape.Square;

public class ShapeFactory {
    public static enum ShapeEnum {
        CIRCLE, RECTANGLE, SQUARE;
    }

    public static Shape getShape(ShapeEnum type) {
        if (type == null)
            return null;
        if (type == ShapeEnum.CIRCLE)
            return new Circle();
        else if (type == ShapeEnum.RECTANGLE)
            return new Square();
        else if (type == ShapeEnum.SQUARE)
            return new Rectangle();
        return null;
    }

    public static <T extends Shape> T getShape(Class<T> clazz)
            throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}
