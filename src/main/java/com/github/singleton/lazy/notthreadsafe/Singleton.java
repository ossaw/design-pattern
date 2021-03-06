package com.github.singleton.lazy.notthreadsafe;

import com.github.singleton.annotation.NotThreadSafe;

@NotThreadSafe
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
