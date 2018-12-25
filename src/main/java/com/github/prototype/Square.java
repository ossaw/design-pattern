package com.github.prototype;

public class Square extends Shape {

    public Square() {}

    public Square(String id, String type) {
        super(id, type);
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
