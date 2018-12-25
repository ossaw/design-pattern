package com.github.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Display monitor.";
    }

}
