package com.github.visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String toString() {
        return "Display keyboard.";
    }

}
