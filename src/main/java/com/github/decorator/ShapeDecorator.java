package com.github.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    protected ShapeDecorator(Shape shape) {
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
