package com.github.abstractfactory.demo;

import static com.github.abstractfactory.ColorFactory.BLUE;
import static com.github.abstractfactory.ColorFactory.GREEN;
import static com.github.abstractfactory.ColorFactory.RED;
import static com.github.abstractfactory.ShapeFactory.CIRCLE;
import static com.github.abstractfactory.ShapeFactory.RECTANGLE;
import static com.github.abstractfactory.ShapeFactory.SQUARE;

import com.github.abstractfactory.AbstractFactory;
import com.github.abstractfactory.color.Color;
import com.github.abstractfactory.factoryproducer.FactoryProducer;
import com.github.abstractfactory.factoryproducer.FactoryProducer.FactoryType;
import com.github.abstractfactory.shape.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        final AbstractFactory shapeFactory = FactoryProducer.getFactory(
                FactoryType.SHAPE);

        Shape shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();

        final AbstractFactory colorFactory = FactoryProducer.getFactory(
                FactoryType.COLOR);

        Color color1 = colorFactory.getColor(RED);
        color1.fill();

        Color color2 = colorFactory.getColor(GREEN);
        color2.fill();

        Color color3 = colorFactory.getColor(BLUE);
        color3.fill();
    }
}