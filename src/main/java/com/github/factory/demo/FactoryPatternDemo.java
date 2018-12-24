package com.github.factory.demo;

import com.github.factory.factory.ShapeFactory;
import com.github.factory.product.Circle;
import com.github.factory.product.Rectangle;
import com.github.factory.product.Shape;
import com.github.factory.product.Square;

import static com.github.factory.factory.ShapeFactory.CIRCLE;
import static com.github.factory.factory.ShapeFactory.RECTANGLE;
import static com.github.factory.factory.ShapeFactory.SQUARE;;

public class FactoryPatternDemo {

    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException {
        Shape shape1 = ShapeFactory.getShape(CIRCLE);
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape(RECTANGLE);
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape(SQUARE);
        shape3.draw();

        Shape shape4 = ShapeFactory.getShape(Circle.class);
        shape4.draw();

        Shape shape5 = ShapeFactory.getShape(Square.class);
        shape5.draw();

        Shape shape6 = ShapeFactory.getShape(Rectangle.class);
        shape6.draw();
    }

}