package com.github.prototype;

public class Rectangle extends Shape {
    public Rectangle() {}
    
    public Rectangle(String id, String type) {
        super(id, type);
    }
    
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
