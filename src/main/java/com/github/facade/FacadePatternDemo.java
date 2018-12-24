package com.github.facade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }

}