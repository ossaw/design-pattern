package com.github.abstractfactory.factoryproducer;

import com.github.abstractfactory.AbstractFactory;
import com.github.abstractfactory.ColorFactory;
import com.github.abstractfactory.ShapeFactory;

public class FactoryProducer {
    public static enum FactoryType {
        SHAPE, COLOR;
    }

    public static AbstractFactory getFactory(FactoryType type) {
        if (type == null)
            return null;
        if (type == FactoryType.SHAPE)
            return new ShapeFactory();
        else if (type == FactoryType.COLOR)
            return new ColorFactory();
        return null;
    }
}
