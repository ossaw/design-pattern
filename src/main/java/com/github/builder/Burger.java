package com.github.builder;

public abstract class Burger implements Item {
    
    @Override
    public Package packing() {
        return new Wrrapper();
    }
    
    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    
    @Override
    public abstract float price();

}
