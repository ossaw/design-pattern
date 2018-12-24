package com.github.abstractfactory;

import com.github.abstractfactory.color.Blue;
import com.github.abstractfactory.color.Color;
import com.github.abstractfactory.color.Green;
import com.github.abstractfactory.color.Red;

public class ColorFactory extends AbstractFactory {
    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";

    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;
        if (RED.equals(color))
            return new Red();
        else if (GREEN.equals(color))
            return new Green();
        else if (BLUE.equals(color))
            return new Blue();
        return null;
    }

}
