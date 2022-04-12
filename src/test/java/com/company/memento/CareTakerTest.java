package com.company.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CareTakerTest {

    @Test
    void get() {
        Orginator orginator = new Orginator();
        CareTaker careTaker = new CareTaker();

        orginator.setState("State #1");
        orginator.setState("State #2");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State #3");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State #4");
        System.out.println("Current state: " + orginator.getState());

        orginator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + orginator.getState());
        orginator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + orginator.getState());
    }
}