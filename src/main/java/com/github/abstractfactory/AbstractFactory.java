package com.github.abstractfactory;

import com.github.abstractfactory.color.Color;
import com.github.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

    public Color getColor(String color) {
        throw new UnsupportedOperationException();
    }

    public Shape getShape(String shape) {
        throw new UnsupportedOperationException();
    }

}
