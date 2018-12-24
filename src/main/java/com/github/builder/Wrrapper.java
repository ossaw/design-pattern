package com.github.builder;

public class Wrrapper implements Package {

    @Override
    public String pack() {
        return this.toString();
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
