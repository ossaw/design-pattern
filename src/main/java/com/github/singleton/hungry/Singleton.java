package com.github.singleton.hungry;

import com.github.singleton.annotation.ThreadSafe;

@ThreadSafe
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
