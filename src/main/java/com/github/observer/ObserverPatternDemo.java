package com.github.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        final Subject subject = new Subject("start", new TimeObsever());
        subject.setState("running");
        subject.setState("bloking");
        subject.setState("waiting");
    }

}
