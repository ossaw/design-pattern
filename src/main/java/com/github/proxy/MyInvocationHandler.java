package com.github.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("invoke proxy class");
        if ("sellBooks".equals(method.getName())) {
            int invoke = (int) method.invoke(realSubject, args);
            return invoke;
        } else {
            String string = (String) method.invoke(realSubject, args);
            return string;
        }
    }
}