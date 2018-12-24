package com.github.abstractfactory;

import com.github.abstractfactory.shape.Circle;
import com.github.abstractfactory.shape.Rectangle;
import com.github.abstractfactory.shape.Shape;
import com.github.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String SQUARE = "square";

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        if (CIRCLE.equals(shape))
            return new Circle();
        else if (RECTANGLE.equals(shape))
            return new Rectangle();
        else if (SQUARE.equals(shape))
            return new Square();
        return null;
    }
}
