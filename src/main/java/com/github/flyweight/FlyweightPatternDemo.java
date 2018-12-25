package com.github.flyweight;

import java.util.Random;

public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White",
            "Black" };
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[RANDOM.nextInt(colors.length)];
    }

    private static int getRandomX() {
        return RANDOM.nextInt(100);
    }

    private static int getRandomY() {
        return RANDOM.nextInt(100);
    }
}
