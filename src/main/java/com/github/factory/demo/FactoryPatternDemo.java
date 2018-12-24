package com.github.factory.demo;

import com.github.factory.factory.ShapeFactory;
import com.github.factory.factory.ShapeFactory.ShapeEnum;
import com.github.factory.shape.Circle;
import com.github.factory.shape.Rectangle;
import com.github.factory.shape.Shape;
import com.github.factory.shape.Square;;

public class FactoryPatternDemo {

    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException {
        Shape shape1 = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape(ShapeEnum.SQUARE);
        shape3.draw();

        Shape shape4 = ShapeFactory.getShape(Circle.class);
        shape4.draw();

        Shape shape5 = ShapeFactory.getShape(Square.class);
        shape5.draw();

        Shape shape6 = ShapeFactory.getShape(Rectangle.class);
        shape6.draw();
    }

}