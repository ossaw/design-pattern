package com.github.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
