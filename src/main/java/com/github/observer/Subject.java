package com.github.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public Subject(String state, Observer observer) {
        this.state = state;
        observers.add(observer);
        notifiedObserver(state);
    }

    public void setState(String state) {
        this.state = state;
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        notifiedObserver(state);
    }

    public String getState() {
        return state;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifiedObserver(String state) {
        for (Observer observer : observers)
            observer.receiveNotification(state);
    }
}
