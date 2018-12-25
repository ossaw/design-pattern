package com.github.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        final ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
