package com.github.memento;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveState2Memento());
        originator.setState("State #3");
        careTaker.add(originator.saveState2Memento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        System.out.println("First saved State: " + originator
                .getStateFromMemento(careTaker.get(0)));
        System.out.println("Second saved State: " + originator
                .getStateFromMemento(careTaker.get(1)));
    }

}
