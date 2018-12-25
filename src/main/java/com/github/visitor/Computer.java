package com.github.visitor;

public class Computer implements ComputerPart {

    private final ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] { new Mouse(), new Keyboard(),
                new Monitor() };
    }

    @Override
    public String toString() {
        return "Display computer.";
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts)
            part.accept(computerPartVisitor);
        computerPartVisitor.visit(this);
    }

}