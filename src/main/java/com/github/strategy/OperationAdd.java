package com.github.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int operate(int num1, int num2) {
        // ignore int value ranges
        return num1 + num2;
    }

}
