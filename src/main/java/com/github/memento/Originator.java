package com.github.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveState2Memento() {
        return new Memento(state);
    }

    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }
}
