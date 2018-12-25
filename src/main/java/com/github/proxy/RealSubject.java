package com.github.proxy;

public class RealSubject implements Subject {

    @Override
    public int sellBooks() {
        System.out.println("Sell books.");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("Speak");
        return "Tom";
    }

}