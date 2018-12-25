package com.github.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    protected RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }
    
    private void setRedBorder() {
        System.out.println("This shape is red.");
    }
}
