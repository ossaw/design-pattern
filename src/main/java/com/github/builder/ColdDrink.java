package com.github.builder;

public abstract class ColdDrink implements Item {

    @Override
    public Package packing() {
        return new Bottle();
    }
    
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract float price();

}
