package com.github.prototype;

public class Circle extends Shape {
    
    public Circle() {}
    
    public Circle(String id, String type) {
        super(id, type);
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}