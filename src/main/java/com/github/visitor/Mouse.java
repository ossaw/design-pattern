package com.github.visitor;

public class Mouse implements ComputerPart {
    
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String toString() {
        return "Displat mouse.";
    }

}
