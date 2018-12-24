package com.github.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        final Context context = new Context(new OperationAdd());
        println(context.executeStrategy(10, 5));
        context.setStrategy(new OperationSubstract());
        println(context.executeStrategy(10, 5));
    }

    private static void println(int val) {
        System.out.println(val);
    }

}
