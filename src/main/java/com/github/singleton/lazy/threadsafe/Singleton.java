package com.github.singleton.lazy.threadsafe;

import com.github.annotation.ThreadSafe;

@ThreadSafe
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
