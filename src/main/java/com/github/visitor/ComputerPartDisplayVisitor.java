package com.github.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(ComputerPart part) {
        System.out.println(part);
    }

}
