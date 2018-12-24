package com.github.singleton.dcl;

import com.github.annotation.ThreadSafe;

/**
 * @since jdk 1.5
 */
@ThreadSafe
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }
}
