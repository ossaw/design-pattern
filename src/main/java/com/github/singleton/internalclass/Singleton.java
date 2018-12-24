package com.github.singleton.internalclass;

import com.github.singleton.annotation.ThreadSafe;

@ThreadSafe
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
